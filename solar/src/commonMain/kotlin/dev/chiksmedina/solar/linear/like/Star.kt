package dev.chiksmedina.solar.linear.like

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.linear.LikeGroup

val LikeGroup.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(
            name = "Star", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.1532f, 5.4084f)
                curveTo(10.4198f, 3.1361f, 11.0531f, 2.0f, 12.0f, 2.0f)
                curveTo(12.9469f, 2.0f, 13.5802f, 3.1361f, 14.8468f, 5.4084f)
                lineTo(15.1745f, 5.9962f)
                curveTo(15.5345f, 6.6419f, 15.7144f, 6.9648f, 15.9951f, 7.1778f)
                curveTo(16.2757f, 7.3908f, 16.6251f, 7.4699f, 17.3241f, 7.628f)
                lineTo(17.9605f, 7.772f)
                curveTo(20.4201f, 8.3286f, 21.65f, 8.6068f, 21.9426f, 9.5477f)
                curveTo(22.2352f, 10.4886f, 21.3968f, 11.4691f, 19.7199f, 13.4299f)
                lineTo(19.2861f, 13.9372f)
                curveTo(18.8096f, 14.4944f, 18.5713f, 14.773f, 18.4641f, 15.1177f)
                curveTo(18.357f, 15.4624f, 18.393f, 15.8341f, 18.465f, 16.5776f)
                lineTo(18.5306f, 17.2544f)
                curveTo(18.7841f, 19.8706f, 18.9109f, 21.1787f, 18.1449f, 21.7602f)
                curveTo(17.3788f, 22.3417f, 16.2273f, 21.8115f, 13.9243f, 20.7512f)
                lineTo(13.3285f, 20.4768f)
                curveTo(12.6741f, 20.1755f, 12.3469f, 20.0248f, 12.0f, 20.0248f)
                curveTo(11.6531f, 20.0248f, 11.3259f, 20.1755f, 10.6715f, 20.4768f)
                lineTo(10.0757f, 20.7512f)
                curveTo(7.7727f, 21.8115f, 6.6212f, 22.3417f, 5.8552f, 21.7602f)
                curveTo(5.0891f, 21.1787f, 5.2159f, 19.8706f, 5.4694f, 17.2544f)
                lineTo(5.535f, 16.5776f)
                curveTo(5.607f, 15.8341f, 5.6431f, 15.4624f, 5.5359f, 15.1177f)
                curveTo(5.4287f, 14.773f, 5.1904f, 14.4944f, 4.7139f, 13.9372f)
                lineTo(4.2801f, 13.4299f)
                curveTo(2.6033f, 11.4691f, 1.7648f, 10.4886f, 2.0574f, 9.5477f)
                curveTo(2.35f, 8.6068f, 3.5799f, 8.3286f, 6.0395f, 7.772f)
                lineTo(6.6759f, 7.628f)
                curveTo(7.3748f, 7.4699f, 7.7243f, 7.3908f, 8.0049f, 7.1778f)
                curveTo(8.2856f, 6.9648f, 8.4655f, 6.6419f, 8.8255f, 5.9962f)
                lineTo(9.1532f, 5.4084f)
                close()
            }
        }
            .build()
        return _star!!
    }

private var _star: ImageVector? = null
