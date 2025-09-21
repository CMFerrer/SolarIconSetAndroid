package dev.chiksmedina.solar.linear.homefurniture

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.linear.HomeFurnitureGroup

val HomeFurnitureGroup.BarChair: ImageVector
    get() {
        if (_barChair != null) {
            return _barChair!!
        }
        _barChair = Builder(
            name = "BarChair", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.0315f, 6.9375f)
                curveTo(4.7573f, 4.7286f, 6.3019f, 2.6977f, 8.5421f, 2.3217f)
                lineTo(8.9396f, 2.255f)
                curveTo(10.9651f, 1.915f, 13.0349f, 1.915f, 15.0604f, 2.255f)
                lineTo(15.4579f, 2.3217f)
                curveTo(17.6981f, 2.6977f, 19.2427f, 4.7286f, 18.9685f, 6.9375f)
                lineTo(18.9505f, 7.0827f)
                curveTo(18.8855f, 7.6063f, 18.4315f, 8.0f, 17.8928f, 8.0f)
                horizontalLineTo(6.1072f)
                curveTo(5.5685f, 8.0f, 5.1145f, 7.6063f, 5.0495f, 7.0827f)
                lineTo(5.0315f, 6.9375f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 8.0f)
                lineTo(6.0f, 22.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.0f, 8.0f)
                lineTo(18.0f, 22.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.0f, 17.0f)
                horizontalLineTo(7.0f)
            }
        }
            .build()
        return _barChair!!
    }

private var _barChair: ImageVector? = null
