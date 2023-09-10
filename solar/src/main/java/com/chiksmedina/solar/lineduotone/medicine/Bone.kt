package com.chiksmedina.solar.lineduotone.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.MedicineGroup

val MedicineGroup.Bone: ImageVector
    get() {
        if (_bone != null) {
            return _bone!!
        }
        _bone = Builder(
            name = "Bone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Round,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.9313f, 16.6311f)
                curveTo(10.5378f, 17.0246f, 10.562f, 17.674f, 10.7105f, 18.2103f)
                curveTo(10.9908f, 19.2235f, 10.6058f, 20.519f, 9.8626f, 21.2622f)
                curveTo(8.8788f, 22.2459f, 7.2839f, 22.2459f, 6.3002f, 21.2622f)
                curveTo(5.3165f, 20.2785f, 5.3165f, 18.6835f, 6.3002f, 17.6998f)
                curveTo(5.3165f, 18.6835f, 3.7215f, 18.6835f, 2.7378f, 17.6998f)
                curveTo(1.7541f, 16.7161f, 1.7541f, 15.1212f, 2.7378f, 14.1374f)
                curveTo(3.481f, 13.3942f, 4.7765f, 13.0092f, 5.7897f, 13.2895f)
                curveTo(6.326f, 13.438f, 6.9754f, 13.4622f, 7.3689f, 13.0687f)
                moveTo(16.6311f, 10.9313f)
                curveTo(17.0246f, 10.5378f, 17.674f, 10.562f, 18.2103f, 10.7105f)
                curveTo(19.2235f, 10.9908f, 20.519f, 10.6058f, 21.2622f, 9.8626f)
                curveTo(22.2459f, 8.8788f, 22.2459f, 7.2839f, 21.2622f, 6.3002f)
                curveTo(20.2785f, 5.3165f, 18.6835f, 5.3165f, 17.6998f, 6.3002f)
                curveTo(18.6835f, 5.3165f, 18.6835f, 3.7215f, 17.6998f, 2.7378f)
                curveTo(16.7161f, 1.7541f, 15.1212f, 1.7541f, 14.1374f, 2.7378f)
                curveTo(13.3942f, 3.481f, 13.0092f, 4.7765f, 13.2895f, 5.7897f)
                curveTo(13.438f, 6.326f, 13.4622f, 6.9754f, 13.0687f, 7.3689f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.1614f, 11.4616f)
                curveTo(17.4543f, 11.1687f, 17.4543f, 10.6938f, 17.1614f, 10.401f)
                curveTo(16.8685f, 10.1081f, 16.3937f, 10.1081f, 16.1008f, 10.401f)
                lineTo(17.1614f, 11.4616f)
                close()
                moveTo(13.599f, 7.8992f)
                curveTo(13.8919f, 7.6063f, 13.8919f, 7.1315f, 13.599f, 6.8386f)
                curveTo(13.3062f, 6.5457f, 12.8313f, 6.5457f, 12.5384f, 6.8386f)
                lineTo(13.599f, 7.8992f)
                close()
                moveTo(11.4616f, 17.1614f)
                lineTo(17.1614f, 11.4616f)
                lineTo(16.1008f, 10.401f)
                lineTo(10.401f, 16.1008f)
                lineTo(11.4616f, 17.1614f)
                close()
                moveTo(7.8992f, 13.599f)
                lineTo(13.599f, 7.8992f)
                lineTo(12.5384f, 6.8386f)
                lineTo(6.8386f, 12.5384f)
                lineTo(7.8992f, 13.599f)
                close()
            }
        }
            .build()
        return _bone!!
    }

private var _bone: ImageVector? = null
