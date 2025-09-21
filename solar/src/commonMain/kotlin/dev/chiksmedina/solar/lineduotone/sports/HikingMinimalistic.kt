package dev.chiksmedina.solar.lineduotone.sports

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
import dev.chiksmedina.solar.lineduotone.SportsGroup

val SportsGroup.HikingMinimalistic: ImageVector
    get() {
        if (_hikingMinimalistic != null) {
            return _hikingMinimalistic!!
        }
        _hikingMinimalistic = Builder(
            name = "HikingMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.5f, 5.5f)
                moveToRelative(-2.5f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 16.5f)
                curveTo(9.0f, 16.5f, 8.5744f, 18.1192f, 8.0f, 19.0f)
                curveTo(7.3966f, 19.9252f, 6.0f, 21.0f, 6.0f, 21.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.2099f, 11.901f)
                lineTo(10.9561f, 11.9756f)
                lineTo(10.9561f, 11.9756f)
                lineTo(10.2099f, 11.901f)
                close()
                moveTo(10.1413f, 12.5871f)
                lineTo(9.395f, 12.5125f)
                lineTo(9.395f, 12.5125f)
                lineTo(10.1413f, 12.5871f)
                close()
                moveTo(18.5767f, 9.8527f)
                lineTo(18.0965f, 9.2766f)
                lineTo(18.0965f, 9.2766f)
                lineTo(18.5767f, 9.8527f)
                close()
                moveTo(19.4801f, 10.0762f)
                curveTo(19.7983f, 9.811f, 19.8413f, 9.3381f, 19.5761f, 9.0199f)
                curveTo(19.311f, 8.7016f, 18.838f, 8.6587f, 18.5198f, 8.9238f)
                lineTo(19.4801f, 10.0762f)
                close()
                moveTo(11.2041f, 14.7526f)
                lineTo(10.8066f, 15.3886f)
                lineTo(10.8066f, 15.3886f)
                lineTo(11.2041f, 14.7526f)
                close()
                moveTo(11.5374f, 14.9609f)
                lineTo(11.9349f, 14.3249f)
                lineTo(11.9349f, 14.3249f)
                lineTo(11.5374f, 14.9609f)
                close()
                moveTo(14.2573f, 19.3926f)
                lineTo(15.0044f, 19.3261f)
                lineTo(15.0044f, 19.3261f)
                lineTo(14.2573f, 19.3926f)
                close()
                moveTo(13.6533f, 21.0665f)
                curveTo(13.69f, 21.4791f, 14.0542f, 21.7838f, 14.4668f, 21.747f)
                curveTo(14.8794f, 21.7103f, 15.1841f, 21.3461f, 15.1474f, 20.9335f)
                lineTo(13.6533f, 21.0665f)
                close()
                moveTo(13.0f, 10.5f)
                lineTo(12.6141f, 11.1431f)
                curveTo(12.6306f, 11.153f, 12.6474f, 11.1622f, 12.6646f, 11.1708f)
                lineTo(13.0f, 10.5f)
                close()
                moveTo(9.4636f, 11.8264f)
                lineTo(9.395f, 12.5125f)
                lineTo(10.8875f, 12.6617f)
                lineTo(10.9561f, 11.9756f)
                lineTo(9.4636f, 11.8264f)
                close()
                moveTo(19.0568f, 10.4289f)
                lineTo(19.4801f, 10.0762f)
                lineTo(18.5198f, 8.9238f)
                lineTo(18.0965f, 9.2766f)
                lineTo(19.0568f, 10.4289f)
                close()
                moveTo(10.8066f, 15.3886f)
                lineTo(11.1399f, 15.5969f)
                lineTo(11.9349f, 14.3249f)
                lineTo(11.6016f, 14.1166f)
                lineTo(10.8066f, 15.3886f)
                close()
                moveTo(13.5103f, 19.4591f)
                lineTo(13.6533f, 21.0665f)
                lineTo(15.1474f, 20.9335f)
                lineTo(15.0044f, 19.3261f)
                lineTo(13.5103f, 19.4591f)
                close()
                moveTo(12.6646f, 11.1708f)
                curveTo(14.7535f, 12.2153f, 17.2626f, 11.9241f, 19.0568f, 10.4289f)
                lineTo(18.0965f, 9.2766f)
                curveTo(16.7602f, 10.3902f, 14.8913f, 10.6071f, 13.3354f, 9.8292f)
                lineTo(12.6646f, 11.1708f)
                close()
                moveTo(11.1399f, 15.5969f)
                curveTo(12.4916f, 16.4417f, 13.369f, 17.8713f, 13.5103f, 19.4591f)
                lineTo(15.0044f, 19.3261f)
                curveTo(14.8215f, 17.2701f, 13.6852f, 15.4188f, 11.9349f, 14.3249f)
                lineTo(11.1399f, 15.5969f)
                close()
                moveTo(9.395f, 12.5125f)
                curveTo(9.2801f, 13.6616f, 9.8272f, 14.7765f, 10.8066f, 15.3886f)
                lineTo(11.6016f, 14.1166f)
                curveTo(11.1062f, 13.807f, 10.8294f, 13.243f, 10.8875f, 12.6617f)
                lineTo(9.395f, 12.5125f)
                close()
                moveTo(10.9561f, 11.9756f)
                curveTo(11.0363f, 11.1741f, 11.9234f, 10.7287f, 12.6141f, 11.1431f)
                lineTo(13.3858f, 9.8568f)
                curveTo(11.7518f, 8.8764f, 9.6532f, 9.9302f, 9.4636f, 11.8264f)
                lineTo(10.9561f, 11.9756f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.0f, 21.0f)
                verticalLineTo(7.0f)
            }
        }
            .build()
        return _hikingMinimalistic!!
    }

private var _hikingMinimalistic: ImageVector? = null
