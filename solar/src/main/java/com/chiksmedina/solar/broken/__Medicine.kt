package com.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BrokenGroup
import com.chiksmedina.solar.broken.medicine.AdhesivePlaster
import com.chiksmedina.solar.broken.medicine.AdhesivePlaster2
import com.chiksmedina.solar.broken.medicine.Bacteria
import com.chiksmedina.solar.broken.medicine.BenzeneRing
import com.chiksmedina.solar.broken.medicine.Bone
import com.chiksmedina.solar.broken.medicine.BoneBroken
import com.chiksmedina.solar.broken.medicine.BoneCrack
import com.chiksmedina.solar.broken.medicine.Bones
import com.chiksmedina.solar.broken.medicine.Dna
import com.chiksmedina.solar.broken.medicine.Dropper
import com.chiksmedina.solar.broken.medicine.Dropper2
import com.chiksmedina.solar.broken.medicine.Dropper3
import com.chiksmedina.solar.broken.medicine.DropperMinimalistic
import com.chiksmedina.solar.broken.medicine.DropperMinimalistic2
import com.chiksmedina.solar.broken.medicine.Health
import com.chiksmedina.solar.broken.medicine.HeartPulse
import com.chiksmedina.solar.broken.medicine.HeartPulse2
import com.chiksmedina.solar.broken.medicine.JarOfPills
import com.chiksmedina.solar.broken.medicine.JarOfPills2
import com.chiksmedina.solar.broken.medicine.MedicalKit
import com.chiksmedina.solar.broken.medicine.Pill
import com.chiksmedina.solar.broken.medicine.Pills
import com.chiksmedina.solar.broken.medicine.Pills2
import com.chiksmedina.solar.broken.medicine.Pills3
import com.chiksmedina.solar.broken.medicine.Pulse
import com.chiksmedina.solar.broken.medicine.Pulse2
import com.chiksmedina.solar.broken.medicine.Stethoscope
import com.chiksmedina.solar.broken.medicine.Syringe
import com.chiksmedina.solar.broken.medicine.TestTube
import com.chiksmedina.solar.broken.medicine.TestTubeMinimalistic
import com.chiksmedina.solar.broken.medicine.Thermometer
import com.chiksmedina.solar.broken.medicine.Virus
import kotlin.collections.List as ____KtList

public object MedicineGroup

public val BrokenGroup.Medicine: MedicineGroup
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
