package dev.chiksmedina.solar.linear.school

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
import dev.chiksmedina.solar.linear.SchoolGroup

val SchoolGroup.Diploma: ImageVector
    get() {
        if (_diploma != null) {
            return _diploma!!
        }
        _diploma = Builder(
            name = "Diploma", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 16.0f)
                moveToRelative(-3.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 19.2597f)
                lineTo(9.7371f, 21.4292f)
                curveTo(9.4131f, 21.7399f, 9.251f, 21.8952f, 9.1138f, 21.949f)
                curveTo(8.8011f, 22.0715f, 8.4543f, 21.9666f, 8.2898f, 21.6999f)
                curveTo(8.2176f, 21.5829f, 8.1951f, 21.3718f, 8.1501f, 20.9495f)
                curveTo(8.1247f, 20.7111f, 8.112f, 20.5919f, 8.0735f, 20.4921f)
                curveTo(7.9872f, 20.2686f, 7.8058f, 20.0947f, 7.5727f, 20.012f)
                curveTo(7.4685f, 19.975f, 7.3442f, 19.9629f, 7.0955f, 19.9385f)
                curveTo(6.6551f, 19.8954f, 6.4349f, 19.8738f, 6.3128f, 19.8046f)
                curveTo(6.0346f, 19.6469f, 5.9253f, 19.3144f, 6.0531f, 19.0146f)
                curveTo(6.1091f, 18.883f, 6.2712f, 18.7277f, 6.5952f, 18.417f)
                lineTo(8.0735f, 16.9998f)
                lineTo(9.1138f, 15.9595f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 19.2597f)
                lineTo(14.2629f, 21.4291f)
                curveTo(14.5869f, 21.7398f, 14.749f, 21.8952f, 14.8862f, 21.9489f)
                curveTo(15.1989f, 22.0714f, 15.5457f, 21.9666f, 15.7102f, 21.6999f)
                curveTo(15.7824f, 21.5828f, 15.8049f, 21.3717f, 15.8499f, 20.9495f)
                curveTo(15.8753f, 20.7111f, 15.888f, 20.5919f, 15.9265f, 20.4921f)
                curveTo(16.0129f, 20.2686f, 16.1942f, 20.0947f, 16.4273f, 20.012f)
                curveTo(16.5315f, 19.975f, 16.6558f, 19.9628f, 16.9045f, 19.9385f)
                curveTo(17.3449f, 19.8953f, 17.5651f, 19.8738f, 17.6872f, 19.8046f)
                curveTo(17.9654f, 19.6469f, 18.0747f, 19.3143f, 17.9469f, 19.0146f)
                curveTo(17.8909f, 18.883f, 17.7288f, 18.7277f, 17.4048f, 18.417f)
                lineTo(15.9265f, 16.9998f)
                lineTo(15.0f, 16.0732f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.3197f, 17.9957f)
                curveTo(19.2921f, 17.9748f, 20.3915f, 17.8512f, 21.1213f, 17.1213f)
                curveTo(22.0f, 16.2426f, 22.0f, 14.8284f, 22.0f, 12.0f)
                verticalLineTo(8.0f)
                curveTo(22.0f, 5.1716f, 22.0f, 3.7574f, 21.1213f, 2.8787f)
                curveTo(20.2426f, 2.0f, 18.8284f, 2.0f, 16.0f, 2.0f)
                lineTo(8.0f, 2.0f)
                curveTo(5.1716f, 2.0f, 3.7574f, 2.0f, 2.8787f, 2.8787f)
                curveTo(2.0f, 3.7574f, 2.0f, 5.1716f, 2.0f, 8.0f)
                lineTo(2.0f, 12.0f)
                curveTo(2.0f, 14.8284f, 2.0f, 16.2426f, 2.8787f, 17.1213f)
                curveTo(3.6471f, 17.8897f, 4.825f, 17.9862f, 7.0f, 17.9983f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 6.0f)
                lineTo(15.0f, 6.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.0f, 9.5f)
                horizontalLineTo(17.0f)
            }
        }
            .build()
        return _diploma!!
    }

private var _diploma: ImageVector? = null
