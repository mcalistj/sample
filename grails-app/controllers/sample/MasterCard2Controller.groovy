package sample


class MasterCard2Controller {

	def GeoIpService
	
	def index() { 

	

	//def ip = getIpAddress()
	def ip = "80.43.163.109"
	
	if(ip=="127.0.0.1"){
	
	render "Local Host"
	}
	
	else{
	def location = GeoIpService.getLocation(ip)
	render location.countryName + " " + location.city
	}
	
}
def getIpAddress() {
	def ipAddress = request.getRemoteAddr()
	
	if (ipAddress != null){
		log.info("Remote IP Address ::: " + ipAddress)
		System.out.println("Remote IP Address ::: " + ipAddress)
		return ipAddress
	}
	
	ipAddress = request.getHeader("X-Forwarded-For")
	
	if(ipAddress != null) {
		log.info("Remote IP Address ::: " + ipAddress)
		
		return ipAddress
	}
	
	ipAddress = request.getHeader("Client-IP")
	
	if(ipAddress != null) {
		log.info("Remote IP Address ::: " + ipAddress)
		
		return ipAddress
	}
	
	
	return ipAddress
	
}

}
