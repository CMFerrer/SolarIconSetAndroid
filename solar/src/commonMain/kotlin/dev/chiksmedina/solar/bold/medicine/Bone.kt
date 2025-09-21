package dev.chiksmedina.solar.bold.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.MedicineGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.1374f, 2.7378f)
                curveTo(13.3942f, 3.481f, 13.0092f, 4.7765f, 13.2895f, 5.7897f)
                curveTo(13.438f, 6.326f, 13.4622f, 6.9754f, 13.0687f, 7.3689f)
                lineTo(7.3689f, 13.0687f)
                curveTo(6.9754f, 13.4622f, 6.326f, 13.438f, 5.7897f, 13.2895f)
                curveTo(4.7765f, 13.0092f, 3.481f, 13.3942f, 2.7378f, 14.1374f)
                curveTo(1.7541f, 15.1212f, 1.7541f, 16.7161f, 2.7378f, 17.6998f)
                curveTo(3.7215f, 18.6835f, 5.3165f, 18.6835f, 6.3002f, 17.6998f)
                curveTo(5.3165f, 18.6835f, 5.3165f, 20.2785f, 6.3002f, 21.2622f)
                curveTo(7.2839f, 22.2459f, 8.8788f, 22.2459f, 9.8626f, 21.2622f)
                curveTo(10.6058f, 20.519f, 10.9908f, 19.2235f, 10.7105f, 18.2103f)
                curveTo(10.562f, 17.674f, 10.5378f, 17.0246f, 10.9313f, 16.6311f)
                lineTo(16.6311f, 10.9313f)
                curveTo(17.0246f, 10.5378f, 17.674f, 10.562f, 18.2103f, 10.7105f)
                curveTo(19.2235f, 10.9908f, 20.519f, 10.6058f, 21.2622f, 9.8626f)
                curveTo(22.2459f, 8.8788f, 22.2459f, 7.2839f, 21.2622f, 6.3002f)
                curveTo(20.2785f, 5.3165f, 18.6835f, 5.3165f, 17.6998f, 6.3002f)
                curveTo(18.6835f, 5.3165f, 18.6835f, 3.7215f, 17.6998f, 2.7378f)
                curveTo(16.7161f, 1.7541f, 15.1212f, 1.7541f, 14.1374f, 2.7378f)
                close()
            }
        }
            .build()
        return _bone!!
    }

private var _bone: ImageVector? = null
