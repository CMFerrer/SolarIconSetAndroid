package com.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldGroup
import com.chiksmedina.solar.bold.medicine.AdhesivePlaster
import com.chiksmedina.solar.bold.medicine.AdhesivePlaster2
import com.chiksmedina.solar.bold.medicine.Bacteria
import com.chiksmedina.solar.bold.medicine.BenzeneRing
import com.chiksmedina.solar.bold.medicine.Bone
import com.chiksmedina.solar.bold.medicine.BoneBroken
import com.chiksmedina.solar.bold.medicine.BoneCrack
import com.chiksmedina.solar.bold.medicine.Bones
import com.chiksmedina.solar.bold.medicine.Dna
import com.chiksmedina.solar.bold.medicine.Dropper
import com.chiksmedina.solar.bold.medicine.Dropper2
import com.chiksmedina.solar.bold.medicine.Dropper3
import com.chiksmedina.solar.bold.medicine.DropperMinimalistic
import com.chiksmedina.solar.bold.medicine.DropperMinimalistic2
import com.chiksmedina.solar.bold.medicine.Health
import com.chiksmedina.solar.bold.medicine.HeartPulse
import com.chiksmedina.solar.bold.medicine.HeartPulse2
import com.chiksmedina.solar.bold.medicine.JarOfPills
import com.chiksmedina.solar.bold.medicine.JarOfPills2
import com.chiksmedina.solar.bold.medicine.MedicalKit
import com.chiksmedina.solar.bold.medicine.Pill
import com.chiksmedina.solar.bold.medicine.Pills
import com.chiksmedina.solar.bold.medicine.Pills2
import com.chiksmedina.solar.bold.medicine.Pills3
import com.chiksmedina.solar.bold.medicine.Pulse
import com.chiksmedina.solar.bold.medicine.Pulse2
import com.chiksmedina.solar.bold.medicine.Stethoscope
import com.chiksmedina.solar.bold.medicine.Syringe
import com.chiksmedina.solar.bold.medicine.TestTube
import com.chiksmedina.solar.bold.medicine.TestTubeMinimalistic
import com.chiksmedina.solar.bold.medicine.Thermometer
import com.chiksmedina.solar.bold.medicine.Virus
import kotlin.collections.List as ____KtList

public object MedicineGroup

public val BoldGroup.Medicine: MedicineGroup
  get() = MedicineGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val MedicineGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(AdhesivePlaster, AdhesivePlaster2, Bacteria, BenzeneRing, Bone, Bones,
        BoneBroken, BoneCrack, Dna, Dropper, Dropper2, Dropper3, DropperMinimalistic,
        DropperMinimalistic2, Health, HeartPulse, HeartPulse2, JarOfPills, JarOfPills2, MedicalKit,
        Pill, Pills, Pills2, Pills3, Pulse, Pulse2, Stethoscope, Syringe, TestTube,
        TestTubeMinimalistic, Thermometer, Virus)
    return __AllIcons!!
  }
