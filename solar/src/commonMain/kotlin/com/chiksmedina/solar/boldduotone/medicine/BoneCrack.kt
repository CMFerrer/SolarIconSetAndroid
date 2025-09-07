package com.chiksmedina.solar.boldduotone.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.MedicineGroup

val MedicineGroup.BoneCrack: ImageVector
    get() {
        if (_boneCrack != null) {
            return _boneCrack!!
        }
        _boneCrack = Builder(
            name = "BoneCrack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.7378f, 17.6998f)
                curveTo(3.7215f, 18.6835f, 5.3165f, 18.6835f, 6.3002f, 17.6998f)
                curveTo(5.3165f, 18.6835f, 5.3165f, 20.2784f, 6.3002f, 21.2621f)
                curveTo(7.2839f, 22.2459f, 8.8788f, 22.2459f, 9.8626f, 21.2621f)
                curveTo(10.6058f, 20.5189f, 10.9908f, 19.2235f, 10.7105f, 18.2102f)
                curveTo(10.562f, 17.6739f, 10.5378f, 17.0245f, 10.9313f, 16.631f)
                lineTo(15.3831f, 12.1792f)
                lineTo(12.3535f, 13.0605f)
                verticalLineTo(11.6463f)
                lineTo(10.2322f, 12.3534f)
                lineTo(10.2188f, 10.2188f)
                lineTo(7.3689f, 13.0687f)
                curveTo(6.9754f, 13.4621f, 6.326f, 13.4379f, 5.7897f, 13.2895f)
                curveTo(4.7765f, 13.0091f, 3.481f, 13.3942f, 2.7378f, 14.1374f)
                curveTo(1.7541f, 15.1211f, 1.7541f, 16.716f, 2.7378f, 17.6998f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.1374f, 2.7378f)
                curveTo(13.3942f, 3.481f, 13.0091f, 4.7765f, 13.2895f, 5.7897f)
                curveTo(13.4379f, 6.326f, 13.4622f, 6.9754f, 13.0687f, 7.3689f)
                lineTo(10.2188f, 10.2188f)
                lineTo(10.2321f, 12.3535f)
                lineTo(12.3534f, 11.6464f)
                verticalLineTo(13.0606f)
                lineTo(15.3831f, 12.1793f)
                lineTo(16.631f, 10.9313f)
                curveTo(17.0245f, 10.5378f, 17.6739f, 10.562f, 18.2102f, 10.7105f)
                curveTo(19.2235f, 10.9908f, 20.5189f, 10.6058f, 21.2621f, 9.8626f)
                curveTo(22.2459f, 8.8788f, 22.2459f, 7.2839f, 21.2621f, 6.3002f)
                curveTo(20.2784f, 5.3165f, 18.6835f, 5.3165f, 17.6998f, 6.3002f)
                curveTo(18.6835f, 5.3165f, 18.6835f, 3.7215f, 17.6998f, 2.7378f)
                curveTo(16.716f, 1.7541f, 15.1211f, 1.7541f, 14.1374f, 2.7378f)
                close()
            }
        }
            .build()
        return _boneCrack!!
    }

private var _boneCrack: ImageVector? = null
