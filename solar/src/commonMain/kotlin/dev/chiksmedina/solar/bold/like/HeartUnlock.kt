package dev.chiksmedina.solar.bold.like

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.LikeGroup

val LikeGroup.HeartUnlock: ImageVector
    get() {
        if (_heartUnlock != null) {
            return _heartUnlock!!
        }
        _heartUnlock = Builder(
            name = "HeartUnlock", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(7.75f, 7.0f)
                curveTo(7.75f, 5.4897f, 8.1881f, 4.453f, 8.8607f, 3.7925f)
                curveTo(9.5362f, 3.1291f, 10.545f, 2.75f, 11.8718f, 2.75f)
                curveTo(13.5394f, 2.75f, 14.7129f, 3.3442f, 15.3621f, 4.3944f)
                curveTo(15.5798f, 4.7467f, 16.042f, 4.8558f, 16.3944f, 4.6379f)
                curveTo(16.7467f, 4.4201f, 16.8557f, 3.958f, 16.6379f, 3.6056f)
                curveTo(15.6448f, 1.999f, 13.9089f, 1.25f, 11.8718f, 1.25f)
                curveTo(10.2634f, 1.25f, 8.8363f, 1.7141f, 7.8097f, 2.7222f)
                curveTo(6.7802f, 3.7333f, 6.25f, 5.1966f, 6.25f, 7.0f)
                verticalLineTo(7.2892f)
                curveTo(4.366f, 7.9875f, 3.0f, 9.8733f, 3.0f, 12.0992f)
                curveTo(3.0f, 15.9375f, 5.9684f, 18.1516f, 8.4957f, 20.0368f)
                curveTo(8.7583f, 20.2327f, 9.0162f, 20.4251f, 9.2656f, 20.6154f)
                curveTo(10.2f, 21.3285f, 11.1f, 22.0f, 12.0f, 22.0f)
                curveTo(12.9f, 22.0f, 13.8f, 21.3285f, 14.7344f, 20.6154f)
                curveTo(14.9838f, 20.4251f, 15.2417f, 20.2327f, 15.5044f, 20.0368f)
                curveTo(18.0316f, 18.1516f, 21.0f, 15.9375f, 21.0f, 12.0992f)
                curveTo(21.0f, 7.862f, 16.0499f, 4.857f, 12.0f, 8.9306f)
                curveTo(10.6105f, 7.533f, 9.1151f, 6.9686f, 7.75f, 7.0013f)
                verticalLineTo(7.0f)
                close()
                moveTo(12.0f, 11.25f)
                curveTo(12.4142f, 11.25f, 12.75f, 11.5858f, 12.75f, 12.0f)
                verticalLineTo(14.5f)
                curveTo(12.75f, 14.9142f, 12.4142f, 15.25f, 12.0f, 15.25f)
                curveTo(11.5858f, 15.25f, 11.25f, 14.9142f, 11.25f, 14.5f)
                verticalLineTo(12.0f)
                curveTo(11.25f, 11.5858f, 11.5858f, 11.25f, 12.0f, 11.25f)
                close()
            }
        }
            .build()
        return _heartUnlock!!
    }

private var _heartUnlock: ImageVector? = null
