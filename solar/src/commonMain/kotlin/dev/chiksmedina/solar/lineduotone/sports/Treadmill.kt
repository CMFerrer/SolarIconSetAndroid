package dev.chiksmedina.solar.lineduotone.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.SportsGroup

val SportsGroup.Treadmill: ImageVector
    get() {
        if (_treadmill != null) {
            return _treadmill!!
        }
        _treadmill = Builder(
            name = "Treadmill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.0f, 4.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.0f, 16.0002f)
                verticalLineTo(14.3667f)
                curveTo(11.0f, 13.8177f, 10.7561f, 13.297f, 10.3344f, 12.9455f)
                lineTo(9.3379f, 12.1152f)
                curveTo(8.6195f, 11.5164f, 8.5702f, 10.43f, 9.2315f, 9.7687f)
                lineTo(10.8855f, 8.1147f)
                curveTo(11.4193f, 7.5809f, 11.2452f, 6.6767f, 10.5513f, 6.3793f)
                curveTo(9.2663f, 5.8286f, 7.793f, 5.942f, 6.6075f, 6.683f)
                lineTo(4.5f, 8.0002f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.0f, 14.0f)
                lineTo(6.6716f, 14.3284f)
                curveTo(6.0935f, 14.9065f, 5.8045f, 15.1955f, 5.4369f, 15.3478f)
                curveTo(5.0694f, 15.5f, 4.6606f, 15.5f, 3.8431f, 15.5f)
                horizontalLineTo(3.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.5f, 10.0f)
                horizontalLineTo(15.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.4888f, 22.0001f)
                horizontalLineTo(3.0868f)
                curveTo(2.4866f, 22.0001f, 2.0f, 21.5135f, 2.0f, 20.9133f)
                curveTo(2.0f, 20.3853f, 2.3794f, 19.9337f, 2.8995f, 19.8427f)
                lineTo(19.0559f, 17.0153f)
                curveTo(20.5926f, 16.7464f, 22.0f, 17.9289f, 22.0f, 19.4889f)
                curveTo(22.0f, 20.8758f, 20.8757f, 22.0001f, 19.4888f, 22.0001f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.2916f, 8.889f)
                lineTo(18.5499f, 8.7778f)
                lineTo(18.5499f, 8.7778f)
                lineTo(19.2916f, 8.889f)
                close()
                moveTo(20.8773f, 7.2245f)
                lineTo(21.0244f, 7.96f)
                lineTo(21.0244f, 7.96f)
                lineTo(20.8773f, 7.2245f)
                close()
                moveTo(22.1471f, 7.7354f)
                curveTo(22.5533f, 7.6542f, 22.8167f, 7.2591f, 22.7354f, 6.8529f)
                curveTo(22.6542f, 6.4467f, 22.2591f, 6.1833f, 21.8529f, 6.2646f)
                lineTo(22.1471f, 7.7354f)
                close()
                moveTo(18.7417f, 17.6113f)
                lineTo(20.0333f, 9.0003f)
                lineTo(18.5499f, 8.7778f)
                lineTo(17.2583f, 17.3887f)
                lineTo(18.7417f, 17.6113f)
                close()
                moveTo(21.0244f, 7.96f)
                lineTo(22.1471f, 7.7354f)
                lineTo(21.8529f, 6.2646f)
                lineTo(20.7302f, 6.4891f)
                lineTo(21.0244f, 7.96f)
                close()
                moveTo(20.0333f, 9.0003f)
                curveTo(20.0862f, 8.6478f, 20.1178f, 8.4449f, 20.1568f, 8.2985f)
                curveTo(20.1744f, 8.2325f, 20.1885f, 8.1988f, 20.1965f, 8.1829f)
                curveTo(20.2002f, 8.1755f, 20.2024f, 8.1722f, 20.2029f, 8.1714f)
                curveTo(20.2034f, 8.1708f, 20.2034f, 8.1707f, 20.2037f, 8.1704f)
                lineTo(19.1177f, 7.1358f)
                curveTo(18.8906f, 7.3741f, 18.7782f, 7.6469f, 18.7076f, 7.9117f)
                curveTo(18.6418f, 8.1582f, 18.5978f, 8.4588f, 18.5499f, 8.7778f)
                lineTo(20.0333f, 9.0003f)
                close()
                moveTo(20.7302f, 6.4891f)
                curveTo(20.414f, 6.5524f, 20.1159f, 6.6109f, 19.8728f, 6.6885f)
                curveTo(19.6117f, 6.772f, 19.3447f, 6.8975f, 19.1177f, 7.1358f)
                lineTo(20.2037f, 8.1704f)
                curveTo(20.2041f, 8.1701f, 20.2041f, 8.17f, 20.2047f, 8.1695f)
                curveTo(20.2054f, 8.169f, 20.2086f, 8.1666f, 20.2159f, 8.1626f)
                curveTo(20.2314f, 8.1538f, 20.2644f, 8.1381f, 20.3294f, 8.1173f)
                curveTo(20.4737f, 8.0712f, 20.6749f, 8.0299f, 21.0244f, 7.96f)
                lineTo(20.7302f, 6.4891f)
                close()
            }
        }
            .build()
        return _treadmill!!
    }

private var _treadmill: ImageVector? = null
