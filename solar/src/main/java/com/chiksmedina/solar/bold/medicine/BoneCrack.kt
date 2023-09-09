package com.chiksmedina.solar.bold.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.MedicineGroup

public val MedicineGroup.BoneCrack: ImageVector
    get() {
        if (_boneCrack != null) {
            return _boneCrack!!
        }
        _boneCrack = Builder(name = "BoneCrack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.2895f, 5.7897f)
                curveTo(13.0092f, 4.7765f, 13.3942f, 3.481f, 14.1374f, 2.7378f)
                curveTo(15.1212f, 1.7541f, 16.7161f, 1.7541f, 17.6998f, 2.7378f)
                curveTo(18.6835f, 3.7215f, 18.6835f, 5.3165f, 17.6998f, 6.3002f)
                curveTo(18.6835f, 5.3165f, 20.2785f, 5.3165f, 21.2622f, 6.3002f)
                curveTo(22.2459f, 7.2839f, 22.2459f, 8.8788f, 21.2622f, 9.8626f)
                curveTo(20.519f, 10.6058f, 19.2235f, 10.9908f, 18.2103f, 10.7105f)
                curveTo(17.674f, 10.562f, 17.0246f, 10.5378f, 16.6311f, 10.9313f)
                lineTo(15.7886f, 11.7738f)
                lineTo(13.1037f, 12.1866f)
                verticalLineTo(11.6465f)
                curveTo(13.1037f, 11.4054f, 12.9879f, 11.179f, 12.7923f, 11.0381f)
                curveTo(12.5967f, 10.8971f, 12.3453f, 10.8587f, 12.1166f, 10.935f)
                lineTo(10.9824f, 11.313f)
                verticalLineTo(9.4552f)
                lineTo(13.0687f, 7.3689f)
                curveTo(13.4622f, 6.9754f, 13.438f, 6.326f, 13.2895f, 5.7897f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.4824f, 10.9552f)
                lineTo(7.3689f, 13.0687f)
                curveTo(6.9754f, 13.4622f, 6.326f, 13.438f, 5.7897f, 13.2895f)
                curveTo(4.7765f, 13.0092f, 3.481f, 13.3942f, 2.7378f, 14.1374f)
                curveTo(1.7541f, 15.1212f, 1.7541f, 16.7161f, 2.7378f, 17.6998f)
                curveTo(3.7215f, 18.6835f, 5.3165f, 18.6835f, 6.3002f, 17.6998f)
                curveTo(5.3165f, 18.6835f, 5.3165f, 20.2785f, 6.3002f, 21.2622f)
                curveTo(7.2839f, 22.2459f, 8.8788f, 22.2459f, 9.8626f, 21.2622f)
                curveTo(10.6058f, 20.519f, 10.9908f, 19.2235f, 10.7105f, 18.2103f)
                curveTo(10.562f, 17.674f, 10.5378f, 17.0246f, 10.9313f, 16.6311f)
                lineTo(13.9953f, 13.5671f)
                lineTo(12.4677f, 13.802f)
                curveTo(12.2514f, 13.8352f, 12.0314f, 13.7724f, 11.8654f, 13.6299f)
                curveTo(11.6993f, 13.4874f, 11.6037f, 13.2795f, 11.6037f, 13.0607f)
                verticalLineTo(12.6871f)
                lineTo(10.4696f, 13.0651f)
                curveTo(10.2409f, 13.1413f, 9.9895f, 13.103f, 9.7939f, 12.962f)
                curveTo(9.5983f, 12.8211f, 9.4824f, 12.5947f, 9.4824f, 12.3536f)
                verticalLineTo(10.9552f)
                close()
            }
        }
        .build()
        return _boneCrack!!
    }

private var _boneCrack: ImageVector? = null
