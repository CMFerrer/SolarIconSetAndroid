package com.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LinearSolar
import com.chiksmedina.solar.linear.medicine.AdhesivePlaster
import com.chiksmedina.solar.linear.medicine.AdhesivePlaster2
import com.chiksmedina.solar.linear.medicine.Bacteria
import com.chiksmedina.solar.linear.medicine.BenzeneRing
import com.chiksmedina.solar.linear.medicine.Bone
import com.chiksmedina.solar.linear.medicine.BoneBroken
import com.chiksmedina.solar.linear.medicine.BoneCrack
import com.chiksmedina.solar.linear.medicine.Bones
import com.chiksmedina.solar.linear.medicine.Dna
import com.chiksmedina.solar.linear.medicine.Dropper
import com.chiksmedina.solar.linear.medicine.Dropper2
import com.chiksmedina.solar.linear.medicine.Dropper3
import com.chiksmedina.solar.linear.medicine.DropperMinimalistic
import com.chiksmedina.solar.linear.medicine.DropperMinimalistic2
import com.chiksmedina.solar.linear.medicine.Health
import com.chiksmedina.solar.linear.medicine.HeartPulse
import com.chiksmedina.solar.linear.medicine.HeartPulse2
import com.chiksmedina.solar.linear.medicine.JarOfPills
import com.chiksmedina.solar.linear.medicine.JarOfPills2
import com.chiksmedina.solar.linear.medicine.MedicalKit
import com.chiksmedina.solar.linear.medicine.Pill
import com.chiksmedina.solar.linear.medicine.Pills
import com.chiksmedina.solar.linear.medicine.Pills2
import com.chiksmedina.solar.linear.medicine.Pills3
import com.chiksmedina.solar.linear.medicine.Pulse
import com.chiksmedina.solar.linear.medicine.Pulse2
import com.chiksmedina.solar.linear.medicine.Stethoscope
import com.chiksmedina.solar.linear.medicine.Syringe
import com.chiksmedina.solar.linear.medicine.TestTube
import com.chiksmedina.solar.linear.medicine.TestTubeMinimalistic
import com.chiksmedina.solar.linear.medicine.Thermometer
import com.chiksmedina.solar.linear.medicine.Virus
import kotlin.collections.List as KtList

object MedicineGroup

val LinearSolar.Medicine: MedicineGroup
    get() = MedicineGroup

private var _AllIcons: KtList<ImageVector>? = null

val MedicineGroup.AllIcons: KtList<ImageVector>
    get() {
        if (_AllIcons != null) {
            return _AllIcons!!
        }
        _AllIcons = listOf(
            AdhesivePlaster,
            AdhesivePlaster2,
            Bacteria,
            BenzeneRing,
            Bone,
            Bones,
            BoneBroken,
            BoneCrack,
            Dna,
            Dropper,
            Dropper2,
            Dropper3,
            DropperMinimalistic,
            DropperMinimalistic2,
            Health,
            HeartPulse,
            HeartPulse2,
            JarOfPills,
            JarOfPills2,
            MedicalKit,
            Pill,
            Pills,
            Pills2,
            Pills3,
            Pulse,
            Pulse2,
            Stethoscope,
            Syringe,
            TestTube,
            TestTubeMinimalistic,
            Thermometer,
            Virus
        )
        return _AllIcons!!
    }
