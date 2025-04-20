import React from 'react';
import { BrowserRouter as Router, Routes, Route, Link } from 'react-router-dom';
import AdminDashboard from './pages/AdminDashboard';
import StudentDashboard from './pages/StudentDashboard';

function App() {
  return (
    <Router>
      <div className="min-h-screen bg-gray-100">
        <nav className="bg-white shadow p-4 flex justify-between">
          <div className="text-xl font-semibold text-blue-600">LMS Portal</div>
          <div className="space-x-4">
            <Link to="/admin" className="text-gray-700 hover:text-blue-600">Admin</Link>
            <Link to="/student" className="text-gray-700 hover:text-blue-600">Student</Link>
          </div>
        </nav>
        <main className="p-6">
          <Routes>
            <Route path="/admin" element={<AdminDashboard />} />
            <Route path="/student" element={<StudentDashboard />} />
            <Route path="*" element={<div>Welcome to the LMS. Please select a portal.</div>} />
          </Routes>
        </main>
      </div>
    </Router>
  );
}

export default App;
