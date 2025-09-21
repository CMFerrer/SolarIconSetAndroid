package dev.chiksmedina.solar.boldduotone.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.ArrowsActionGroup

val ArrowsActionGroup.CircleTopUp: ImageVector
    get() {
        if (_circleTopUp != null) {
            return _circleTopUp!!
        }
        _circleTopUp = Builder(
            name = "CircleTopUp", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.4697f, 11.5303f)
                curveTo(12.1768f, 11.2374f, 12.1768f, 10.7626f, 12.4697f, 10.4697f)
                lineTo(20.1893f, 2.75f)
                horizontalLineTo(16.6562f)
                curveTo(16.242f, 2.75f, 15.9062f, 2.4142f, 15.9062f, 2.0f)
                curveTo(15.9062f, 1.5858f, 16.242f, 1.25f, 16.6562f, 1.25f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 1.25f, 22.75f, 1.5858f, 22.75f, 2.0f)
                verticalLineTo(7.3438f)
                curveTo(22.75f, 7.758f, 22.4142f, 8.0938f, 22.0f, 8.0938f)
                curveTo(21.5858f, 8.0938f, 21.25f, 7.758f, 21.25f, 7.3438f)
                verticalLineTo(3.8107f)
                lineTo(13.5303f, 11.5303f)
                curveTo(13.2374f, 11.8232f, 12.7626f, 11.8232f, 12.4697f, 11.5303f)
                close()
            }
        }
            .build()
        return _circleTopUp!!
    }

private var _circleTopUp: ImageVector? = null
