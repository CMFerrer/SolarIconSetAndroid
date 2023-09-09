package com.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldduotoneGroup
import com.chiksmedina.solar.boldduotone.medicine.AdhesivePlaster
import com.chiksmedina.solar.boldduotone.medicine.AdhesivePlaster2
import com.chiksmedina.solar.boldduotone.medicine.Bacteria
import com.chiksmedina.solar.boldduotone.medicine.BenzeneRing
import com.chiksmedina.solar.boldduotone.medicine.Bone
import com.chiksmedina.solar.boldduotone.medicine.BoneBroken
import com.chiksmedina.solar.boldduotone.medicine.BoneCrack
import com.chiksmedina.solar.boldduotone.medicine.Bones
import com.chiksmedina.solar.boldduotone.medicine.Dna
import com.chiksmedina.solar.boldduotone.medicine.Dropper
import com.chiksmedina.solar.boldduotone.medicine.Dropper2
import com.chiksmedina.solar.boldduotone.medicine.Dropper3
import com.chiksmedina.solar.boldduotone.medicine.DropperMinimalistic
import com.chiksmedina.solar.boldduotone.medicine.DropperMinimalistic2
import com.chiksmedina.solar.boldduotone.medicine.Health
import com.chiksmedina.solar.boldduotone.medicine.HeartPulse
import com.chiksmedina.solar.boldduotone.medicine.HeartPulse2
import com.chiksmedina.solar.boldduotone.medicine.JarOfPills
import com.chiksmedina.solar.boldduotone.medicine.JarOfPills2
import com.chiksmedina.solar.boldduotone.medicine.MedicalKit
import com.chiksmedina.solar.boldduotone.medicine.Pill
import com.chiksmedina.solar.boldduotone.medicine.Pills
import com.chiksmedina.solar.boldduotone.medicine.Pills2
import com.chiksmedina.solar.boldduotone.medicine.Pills3
import com.chiksmedina.solar.boldduotone.medicine.Pulse
import com.chiksmedina.solar.boldduotone.medicine.Pulse2
import com.chiksmedina.solar.boldduotone.medicine.Stethoscope
import com.chiksmedina.solar.boldduotone.medicine.Syringe
import com.chiksmedina.solar.boldduotone.medicine.TestTube
import com.chiksmedina.solar.boldduotone.medicine.TestTubeMinimalistic
import com.chiksmedina.solar.boldduotone.medicine.Thermometer
import com.chiksmedina.solar.boldduotone.medicine.Virus
import kotlin.collections.List as ____KtList

public object MedicineGroup

public val BoldduotoneGroup.Medicine: MedicineGroup
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
