package lt.vtvpmc.exam.ui.controllers;

import lt.vtvpmc.exam.entities.Client;
import lt.vtvpmc.exam.entities.Trip;
import lt.vtvpmc.exam.entities.repositories.ClientRepository;
import lt.vtvpmc.exam.entities.repositories.TripRepository;
import lt.vtvpmc.exam.ui.model.ClientModel;
import lt.vtvpmc.exam.ui.model.TripModel;

public class AddNewTripPageBean {

	private ClientRepository clientRepo;
	private TripRepository tripRepo;
	private ClientModel clientModel;
	private TripModel tripModel;
	private ClientsListPageBean clientsListPageBean;

	public ClientRepository getClientRepo() {
		return clientRepo;
	}

	public void setClientRepo(ClientRepository clientRepo) {
		this.clientRepo = clientRepo;
	}

	public TripRepository getTripRepo() {
		return tripRepo;
	}

	public void setTripRepo(TripRepository tripRepo) {
		this.tripRepo = tripRepo;
	}

	public ClientModel getClientModel() {
		return clientModel;
	}

	public void setClientModel(ClientModel clientModel) {
		this.clientModel = clientModel;
	}

	public TripModel getTripModel() {
		return tripModel;
	}

	public void setTripModel(TripModel tripModel) {
		this.tripModel = tripModel;
	}

	public ClientsListPageBean getClientsListPageBean() {
		return clientsListPageBean;
	}

	public void setClientsListPageBean(ClientsListPageBean clientsListPageBean) {
		this.clientsListPageBean = clientsListPageBean;
	}

	public String addNew() {
		// Invoice invoice = invoicesListPageBean.getData().getCurrentInvoice();
		Client client = clientModel.getSelectedClient();
		// tripModel.setSelectedTrip(new Trip());
		Trip newTrip = tripModel.getSelectedTrip();
		// newItem.setInvoice(invoice);
		newTrip.setClient(client);
		// invoice.addItem(newItem);
		client.addTrip(newTrip);
		// invRepo.save(invoice);
		clientRepo.save(client);

		return "viewCustomer";
	}
}
