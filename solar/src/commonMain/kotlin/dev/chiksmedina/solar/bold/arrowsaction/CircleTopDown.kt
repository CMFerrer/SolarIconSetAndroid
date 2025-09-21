package dev.chiksmedina.solar.bold.arrowsaction

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
import dev.chiksmedina.solar.bold.ArrowsActionGroup

val ArrowsActionGroup.CircleTopDown: ImageVector
    get() {
        if (_circleTopDown != null) {
            return _circleTopDown!!
        }
        _circleTopDown = Builder(
            name = "CircleTopDown", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(21.5303f, 2.4697f)
                curveTo(21.8232f, 2.7626f, 21.8232f, 3.2374f, 21.5303f, 3.5303f)
                lineTo(13.8107f, 11.25f)
                horizontalLineTo(17.3438f)
                curveTo(17.758f, 11.25f, 18.0938f, 11.5858f, 18.0938f, 12.0f)
                curveTo(18.0938f, 12.4142f, 17.758f, 12.75f, 17.3438f, 12.75f)
                horizontalLineTo(12.0f)
                curveTo(11.5858f, 12.75f, 11.25f, 12.4142f, 11.25f, 12.0f)
                verticalLineTo(6.6563f)
                curveTo(11.25f, 6.242f, 11.5858f, 5.9063f, 12.0f, 5.9063f)
                curveTo(12.4142f, 5.9063f, 12.75f, 6.242f, 12.75f, 6.6563f)
                verticalLineTo(10.1893f)
                lineTo(20.4697f, 2.4697f)
                curveTo(20.7626f, 2.1768f, 21.2374f, 2.1768f, 21.5303f, 2.4697f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(20.4817f, 6.7003f)
                lineTo(17.4303f, 9.7516f)
                curveTo(18.6329f, 9.7971f, 19.5938f, 10.7864f, 19.5938f, 12.0f)
                curveTo(19.5938f, 13.2426f, 18.5864f, 14.25f, 17.3438f, 14.25f)
                horizontalLineTo(12.0f)
                curveTo(10.7574f, 14.25f, 9.75f, 13.2426f, 9.75f, 12.0f)
                verticalLineTo(6.6563f)
                curveTo(9.75f, 5.4136f, 10.7574f, 4.4063f, 12.0f, 4.4063f)
                curveTo(13.2136f, 4.4063f, 14.2029f, 5.3671f, 14.2484f, 6.5697f)
                lineTo(17.2997f, 3.5183f)
                curveTo(15.7632f, 2.5562f, 13.9466f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 10.0534f, 21.4438f, 8.2368f, 20.4817f, 6.7003f)
                close()
            }
        }
            .build()
        return _circleTopDown!!
    }

private var _circleTopDown: ImageVector? = null
