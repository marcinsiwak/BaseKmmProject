import SwiftUI
import shared

struct ContentView: View {
	let greet = Greeting().greeting()
	let platform = Platform().platform

	var body: some View {
		Text(greet)
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}