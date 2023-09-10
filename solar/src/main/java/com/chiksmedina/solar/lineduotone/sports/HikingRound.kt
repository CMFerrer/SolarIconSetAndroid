package com.chiksmedina.solar.lineduotone.sports

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
import com.chiksmedina.solar.lineduotone.SportsGroup

val SportsGroup.HikingRound: ImageVector
    get() {
        if (_hikingRound != null) {
            return _hikingRound!!
        }
        _hikingRound = Builder(
            name = "HikingRound", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.5f, 4.5f)
                moveToRelative(-2.5f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 17.5f)
                curveTo(9.0f, 17.5f, 8.5744f, 19.1192f, 8.0f, 20.0f)
                curveTo(7.3966f, 20.9252f, 6.0f, 22.0f, 6.0f, 22.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.2099f, 12.901f)
                lineTo(10.9561f, 12.9756f)
                lineTo(10.9561f, 12.9756f)
                lineTo(10.2099f, 12.901f)
                close()
                moveTo(10.1413f, 13.5871f)
                lineTo(9.395f, 13.5125f)
                lineTo(9.395f, 13.5125f)
                lineTo(10.1413f, 13.5871f)
                close()
                moveTo(18.5767f, 10.8528f)
                lineTo(18.0965f, 10.2766f)
                lineTo(18.0965f, 10.2766f)
                lineTo(18.5767f, 10.8528f)
                close()
                moveTo(19.4801f, 11.0762f)
                curveTo(19.7983f, 10.811f, 19.8413f, 10.3381f, 19.5761f, 10.0199f)
                curveTo(19.311f, 9.7016f, 18.838f, 9.6587f, 18.5198f, 9.9238f)
                lineTo(19.4801f, 11.0762f)
                close()
                moveTo(11.2041f, 15.7526f)
                lineTo(10.8066f, 16.3886f)
                lineTo(10.8066f, 16.3886f)
                lineTo(11.2041f, 15.7526f)
                close()
                moveTo(11.5374f, 15.9609f)
                lineTo(11.9349f, 15.3249f)
                lineTo(11.9349f, 15.3249f)
                lineTo(11.5374f, 15.9609f)
                close()
                moveTo(14.2573f, 20.3926f)
                lineTo(15.0044f, 20.3261f)
                lineTo(15.0044f, 20.3261f)
                lineTo(14.2573f, 20.3926f)
                close()
                moveTo(13.6533f, 22.0665f)
                curveTo(13.69f, 22.4791f, 14.0542f, 22.7838f, 14.4668f, 22.747f)
                curveTo(14.8794f, 22.7103f, 15.1841f, 22.3461f, 15.1474f, 21.9335f)
                lineTo(13.6533f, 22.0665f)
                close()
                moveTo(13.0f, 11.5f)
                lineTo(12.6141f, 12.1431f)
                curveTo(12.6306f, 12.153f, 12.6474f, 12.1622f, 12.6646f, 12.1708f)
                lineTo(13.0f, 11.5f)
                close()
                moveTo(9.4636f, 12.8264f)
                lineTo(9.395f, 13.5125f)
                lineTo(10.8875f, 13.6617f)
                lineTo(10.9561f, 12.9756f)
                lineTo(9.4636f, 12.8264f)
                close()
                moveTo(19.0568f, 11.4289f)
                lineTo(19.4801f, 11.0762f)
                lineTo(18.5198f, 9.9238f)
                lineTo(18.0965f, 10.2766f)
                lineTo(19.0568f, 11.4289f)
                close()
                moveTo(10.8066f, 16.3886f)
                lineTo(11.1399f, 16.5969f)
                lineTo(11.9349f, 15.3249f)
                lineTo(11.6016f, 15.1166f)
                lineTo(10.8066f, 16.3886f)
                close()
                moveTo(13.5103f, 20.4591f)
                lineTo(13.6533f, 22.0665f)
                lineTo(15.1474f, 21.9335f)
                lineTo(15.0044f, 20.3261f)
                lineTo(13.5103f, 20.4591f)
                close()
                moveTo(12.6646f, 12.1708f)
                curveTo(14.7535f, 13.2153f, 17.2626f, 12.9241f, 19.0568f, 11.4289f)
                lineTo(18.0965f, 10.2766f)
                curveTo(16.7602f, 11.3902f, 14.8913f, 11.6071f, 13.3354f, 10.8292f)
                lineTo(12.6646f, 12.1708f)
                close()
                moveTo(11.1399f, 16.5969f)
                curveTo(12.4916f, 17.4417f, 13.369f, 18.8713f, 13.5103f, 20.4591f)
                lineTo(15.0044f, 20.3261f)
                curveTo(14.8215f, 18.2701f, 13.6852f, 16.4188f, 11.9349f, 15.3249f)
                lineTo(11.1399f, 16.5969f)
                close()
                moveTo(9.395f, 13.5125f)
                curveTo(9.2801f, 14.6616f, 9.8272f, 15.7765f, 10.8066f, 16.3886f)
                lineTo(11.6016f, 15.1166f)
                curveTo(11.1062f, 14.807f, 10.8294f, 14.243f, 10.8875f, 13.6617f)
                lineTo(9.395f, 13.5125f)
                close()
                moveTo(10.9561f, 12.9756f)
                curveTo(11.0363f, 12.1741f, 11.9234f, 11.7287f, 12.6141f, 12.1431f)
                lineTo(13.3858f, 10.8569f)
                curveTo(11.7518f, 9.8764f, 9.6532f, 10.9302f, 9.4636f, 12.8264f)
                lineTo(10.9561f, 12.9756f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.0f, 22.0f)
                verticalLineTo(8.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 10.0f)
                lineTo(6.6114f, 10.1437f)
                curveTo(5.8749f, 10.1881f, 5.2494f, 10.6999f, 5.0585f, 11.4143f)
                curveTo(4.8904f, 12.043f, 5.0911f, 12.713f, 5.5769f, 13.1448f)
                lineTo(7.6637f, 15.0f)
            }
        }
            .build()
        return _hikingRound!!
    }

private var _hikingRound: ImageVector? = null
