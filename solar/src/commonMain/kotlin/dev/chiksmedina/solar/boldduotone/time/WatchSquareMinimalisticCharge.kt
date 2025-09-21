package dev.chiksmedina.solar.boldduotone.time

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
import dev.chiksmedina.solar.boldduotone.TimeGroup

val TimeGroup.WatchSquareMinimalisticCharge: ImageVector
    get() {
        if (_watchSquareMinimalisticCharge != null) {
            return _watchSquareMinimalisticCharge!!
        }
        _watchSquareMinimalisticCharge = Builder(
            name = "WatchSquareMinimalisticCharge",
            defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.7777f, 18.3259f)
                curveTo(7.7866f, 19.0f, 9.1911f, 19.0f, 12.0f, 19.0f)
                curveTo(14.8089f, 19.0f, 16.2134f, 19.0f, 17.2223f, 18.3259f)
                curveTo(17.659f, 18.034f, 18.034f, 17.659f, 18.3259f, 17.2223f)
                curveTo(19.0f, 16.2134f, 19.0f, 14.8089f, 19.0f, 12.0f)
                curveTo(19.0f, 9.1911f, 19.0f, 7.7866f, 18.3259f, 6.7777f)
                curveTo(18.034f, 6.341f, 17.659f, 5.966f, 17.2223f, 5.6741f)
                curveTo(16.2134f, 5.0f, 14.8089f, 5.0f, 12.0f, 5.0f)
                curveTo(9.1911f, 5.0f, 7.7866f, 5.0f, 6.7777f, 5.6741f)
                curveTo(6.341f, 5.966f, 5.966f, 6.341f, 5.6741f, 6.7777f)
                curveTo(5.0f, 7.7866f, 5.0f, 9.1911f, 5.0f, 12.0f)
                curveTo(5.0f, 14.8089f, 5.0f, 16.2134f, 5.6741f, 17.2223f)
                curveTo(5.966f, 17.659f, 6.341f, 18.034f, 6.7777f, 18.3259f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.3744f, 8.4569f)
                curveTo(13.6743f, 8.7426f, 13.6859f, 9.2173f, 13.4003f, 9.5172f)
                lineTo(11.75f, 11.25f)
                horizontalLineTo(14.0f)
                curveTo(14.3f, 11.25f, 14.5712f, 11.4288f, 14.6894f, 11.7046f)
                curveTo(14.8076f, 11.9803f, 14.75f, 12.3f, 14.5431f, 12.5172f)
                lineTo(11.686f, 15.5172f)
                curveTo(11.4003f, 15.8172f, 10.9256f, 15.8288f, 10.6256f, 15.5431f)
                curveTo(10.3257f, 15.2574f, 10.3141f, 14.7827f, 10.5998f, 14.4828f)
                lineTo(12.25f, 12.75f)
                horizontalLineTo(10.0f)
                curveTo(9.7f, 12.75f, 9.4288f, 12.5712f, 9.3107f, 12.2954f)
                curveTo(9.1925f, 12.0197f, 9.25f, 11.7f, 9.4569f, 11.4828f)
                lineTo(12.3141f, 8.4828f)
                curveTo(12.5997f, 8.1828f, 13.0745f, 8.1712f, 13.3744f, 8.4569f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(6.25f, 2.0f)
                curveTo(6.25f, 1.5858f, 6.5858f, 1.25f, 7.0f, 1.25f)
                horizontalLineTo(17.0f)
                curveTo(17.4142f, 1.25f, 17.75f, 1.5858f, 17.75f, 2.0f)
                curveTo(17.75f, 2.4142f, 17.4142f, 2.75f, 17.0f, 2.75f)
                horizontalLineTo(7.0f)
                curveTo(6.5858f, 2.75f, 6.25f, 2.4142f, 6.25f, 2.0f)
                close()
                moveTo(6.25f, 22.0f)
                curveTo(6.25f, 21.5858f, 6.5858f, 21.25f, 7.0f, 21.25f)
                horizontalLineTo(17.0f)
                curveTo(17.4142f, 21.25f, 17.75f, 21.5858f, 17.75f, 22.0f)
                curveTo(17.75f, 22.4142f, 17.4142f, 22.75f, 17.0f, 22.75f)
                horizontalLineTo(7.0f)
                curveTo(6.5858f, 22.75f, 6.25f, 22.4142f, 6.25f, 22.0f)
                close()
            }
        }
            .build()
        return _watchSquareMinimalisticCharge!!
    }

private var _watchSquareMinimalisticCharge: ImageVector? = null
