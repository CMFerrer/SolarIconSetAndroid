package dev.chiksmedina.solar.broken.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.MedicineGroup

val MedicineGroup.BoneBroken: ImageVector
    get() {
        if (_boneBroken != null) {
            return _boneBroken!!
        }
        _boneBroken = Builder(
            name = "BoneBroken", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.2895f, 5.7897f)
                curveTo(13.438f, 6.326f, 13.4622f, 6.9754f, 13.0687f, 7.3689f)
                lineTo(11.7892f, 8.6484f)
                curveTo(11.7196f, 8.7181f, 11.7423f, 8.8361f, 11.8329f, 8.8749f)
                curveTo(13.3123f, 9.5089f, 14.4911f, 10.6877f, 15.1251f, 12.1671f)
                curveTo(15.1639f, 12.2577f, 15.2819f, 12.2804f, 15.3516f, 12.2108f)
                lineTo(16.6311f, 10.9313f)
                curveTo(17.0246f, 10.5378f, 17.674f, 10.562f, 18.2103f, 10.7105f)
                curveTo(19.2235f, 10.9908f, 20.519f, 10.6058f, 21.2622f, 9.8626f)
                curveTo(22.2459f, 8.8788f, 22.2459f, 7.2839f, 21.2622f, 6.3002f)
                curveTo(20.2785f, 5.3165f, 18.6835f, 5.3165f, 17.6998f, 6.3002f)
                curveTo(18.6835f, 5.3165f, 18.6835f, 3.7215f, 17.6998f, 2.7378f)
                curveTo(16.7161f, 1.7541f, 15.1212f, 1.7541f, 14.1374f, 2.7378f)
                moveTo(9.8626f, 21.2622f)
                curveTo(8.8788f, 22.2459f, 7.2839f, 22.2459f, 6.3002f, 21.2622f)
                curveTo(5.3165f, 20.2785f, 5.3165f, 18.6835f, 6.3002f, 17.6998f)
                curveTo(5.3165f, 18.6835f, 3.7215f, 18.6835f, 2.7378f, 17.6998f)
                curveTo(1.7541f, 16.7161f, 1.7541f, 15.1212f, 2.7378f, 14.1374f)
                curveTo(3.481f, 13.3942f, 4.7765f, 13.0092f, 5.7897f, 13.2895f)
                curveTo(6.326f, 13.438f, 6.9754f, 13.4622f, 7.3689f, 13.0687f)
                lineTo(8.6484f, 11.7892f)
                curveTo(8.7181f, 11.7196f, 8.8361f, 11.7423f, 8.8749f, 11.8329f)
                curveTo(9.5089f, 13.3123f, 10.6877f, 14.4911f, 12.1671f, 15.1251f)
                curveTo(12.2577f, 15.1639f, 12.2804f, 15.2819f, 12.2108f, 15.3516f)
                lineTo(10.9313f, 16.6311f)
                curveTo(10.5378f, 17.0246f, 10.562f, 17.674f, 10.7105f, 18.2103f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.6572f, 17.6567f)
                lineTo(19.0714f, 19.071f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.3433f, 6.3431f)
                lineTo(4.929f, 4.9289f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.0f, 19.0f)
                verticalLineTo(20.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.0f, 9.0f)
                lineTo(4.0f, 9.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.0f, 15.0f)
                horizontalLineTo(20.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 5.0f)
                lineTo(9.0f, 4.0f)
            }
        }
            .build()
        return _boneBroken!!
    }

private var _boneBroken: ImageVector? = null
