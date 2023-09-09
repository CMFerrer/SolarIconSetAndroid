package com.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LineduotoneGroup
import com.chiksmedina.solar.lineduotone.medicine.AdhesivePlaster
import com.chiksmedina.solar.lineduotone.medicine.AdhesivePlaster2
import com.chiksmedina.solar.lineduotone.medicine.Bacteria
import com.chiksmedina.solar.lineduotone.medicine.BenzeneRing
import com.chiksmedina.solar.lineduotone.medicine.Bone
import com.chiksmedina.solar.lineduotone.medicine.BoneBroken
import com.chiksmedina.solar.lineduotone.medicine.BoneCrack
import com.chiksmedina.solar.lineduotone.medicine.Bones
import com.chiksmedina.solar.lineduotone.medicine.Dna
import com.chiksmedina.solar.lineduotone.medicine.Dropper
import com.chiksmedina.solar.lineduotone.medicine.Dropper2
import com.chiksmedina.solar.lineduotone.medicine.Dropper3
import com.chiksmedina.solar.lineduotone.medicine.DropperMinimalistic
import com.chiksmedina.solar.lineduotone.medicine.DropperMinimalistic2
import com.chiksmedina.solar.lineduotone.medicine.Health
import com.chiksmedina.solar.lineduotone.medicine.HeartPulse
import com.chiksmedina.solar.lineduotone.medicine.HeartPulse2
import com.chiksmedina.solar.lineduotone.medicine.JarOfPills
import com.chiksmedina.solar.lineduotone.medicine.JarOfPills2
import com.chiksmedina.solar.lineduotone.medicine.MedicalKit
import com.chiksmedina.solar.lineduotone.medicine.Pill
import com.chiksmedina.solar.lineduotone.medicine.Pills
import com.chiksmedina.solar.lineduotone.medicine.Pills2
import com.chiksmedina.solar.lineduotone.medicine.Pills3
import com.chiksmedina.solar.lineduotone.medicine.Pulse
import com.chiksmedina.solar.lineduotone.medicine.Pulse2
import com.chiksmedina.solar.lineduotone.medicine.Stethoscope
import com.chiksmedina.solar.lineduotone.medicine.Syringe
import com.chiksmedina.solar.lineduotone.medicine.TestTube
import com.chiksmedina.solar.lineduotone.medicine.TestTubeMinimalistic
import com.chiksmedina.solar.lineduotone.medicine.Thermometer
import com.chiksmedina.solar.lineduotone.medicine.Virus
import kotlin.collections.List as ____KtList

public object MedicineGroup

public val LineduotoneGroup.Medicine: MedicineGroup
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
