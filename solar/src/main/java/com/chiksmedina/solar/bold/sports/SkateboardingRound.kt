package com.chiksmedina.solar.bold.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.SportsGroup

public val SportsGroup.SkateboardingRound: ImageVector
    get() {
        if (_skateboardingRound != null) {
            return _skateboardingRound!!
        }
        _skateboardingRound = Builder(name = "SkateboardingRound", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 4.0f)
                curveTo(21.0f, 5.1046f, 20.1046f, 6.0f, 19.0f, 6.0f)
                curveTo(17.8954f, 6.0f, 17.0f, 5.1046f, 17.0f, 4.0f)
                curveTo(17.0f, 2.8954f, 17.8954f, 2.0f, 19.0f, 2.0f)
                curveTo(20.1046f, 2.0f, 21.0f, 2.8954f, 21.0f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.21f, 6.0468f)
                curveTo(11.6039f, 5.1757f, 13.3359f, 5.0423f, 14.8467f, 5.6898f)
                curveTo(16.0283f, 6.1962f, 16.3248f, 7.7358f, 15.4158f, 8.6449f)
                lineTo(13.7618f, 10.2988f)
                curveTo(13.4124f, 10.6483f, 13.4384f, 11.2224f, 13.8181f, 11.5388f)
                lineTo(14.8145f, 12.3691f)
                curveTo(15.4073f, 12.8631f, 15.75f, 13.5949f, 15.75f, 14.3665f)
                verticalLineTo(16.5f)
                curveTo(15.75f, 16.9142f, 15.4142f, 17.25f, 15.0f, 17.25f)
                curveTo(14.5858f, 17.25f, 14.25f, 16.9142f, 14.25f, 16.5f)
                verticalLineTo(14.3665f)
                curveTo(14.25f, 14.04f, 14.105f, 13.7304f, 13.8542f, 13.5215f)
                lineTo(12.8578f, 12.6911f)
                curveTo(11.8005f, 11.8101f, 11.728f, 10.2113f, 12.7012f, 9.2382f)
                lineTo(14.3552f, 7.5842f)
                curveTo(14.5138f, 7.4256f, 14.462f, 7.1568f, 14.2558f, 7.0685f)
                curveTo(13.1966f, 6.6145f, 11.9822f, 6.708f, 11.005f, 7.3188f)
                lineTo(8.8975f, 8.636f)
                curveTo(8.5463f, 8.8555f, 8.0835f, 8.7487f, 7.864f, 8.3975f)
                curveTo(7.6445f, 8.0463f, 7.7513f, 7.5835f, 8.1025f, 7.364f)
                lineTo(10.21f, 6.0468f)
                close()
                moveTo(2.4983f, 16.4425f)
                curveTo(2.8062f, 16.1654f, 3.2804f, 16.1904f, 3.5575f, 16.4983f)
                lineTo(4.1658f, 17.1741f)
                curveTo(4.7821f, 17.859f, 5.6601f, 18.25f, 6.5815f, 18.25f)
                horizontalLineTo(17.4186f)
                curveTo(18.3399f, 18.25f, 19.2179f, 17.859f, 19.8343f, 17.1741f)
                lineTo(20.4425f, 16.4983f)
                curveTo(20.7196f, 16.1904f, 21.1938f, 16.1654f, 21.5017f, 16.4425f)
                curveTo(21.8096f, 16.7196f, 21.8346f, 17.1938f, 21.5575f, 17.5017f)
                lineTo(20.9492f, 18.1776f)
                curveTo(20.0484f, 19.1785f, 18.7651f, 19.75f, 17.4186f, 19.75f)
                horizontalLineTo(6.5815f)
                curveTo(5.2349f, 19.75f, 3.9516f, 19.1785f, 3.0508f, 18.1776f)
                lineTo(2.4425f, 17.5017f)
                curveTo(2.1654f, 17.1938f, 2.1904f, 16.7196f, 2.4983f, 16.4425f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 21.0f)
                curveTo(8.0f, 21.5523f, 7.5523f, 22.0f, 7.0f, 22.0f)
                curveTo(6.4477f, 22.0f, 6.0f, 21.5523f, 6.0f, 21.0f)
                curveTo(6.0f, 20.4477f, 6.4477f, 20.0f, 7.0f, 20.0f)
                curveTo(7.5523f, 20.0f, 8.0f, 20.4477f, 8.0f, 21.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 21.0f)
                curveTo(18.0f, 21.5523f, 17.5523f, 22.0f, 17.0f, 22.0f)
                curveTo(16.4477f, 22.0f, 16.0f, 21.5523f, 16.0f, 21.0f)
                curveTo(16.0f, 20.4477f, 16.4477f, 20.0f, 17.0f, 20.0f)
                curveTo(17.5523f, 20.0f, 18.0f, 20.4477f, 18.0f, 21.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 9.25f)
                curveTo(16.0858f, 9.25f, 15.75f, 9.5858f, 15.75f, 10.0f)
                curveTo(15.75f, 10.4142f, 16.0858f, 10.75f, 16.5f, 10.75f)
                horizontalLineTo(19.5f)
                curveTo(19.9142f, 10.75f, 20.25f, 10.4142f, 20.25f, 10.0f)
                curveTo(20.25f, 9.5858f, 19.9142f, 9.25f, 19.5f, 9.25f)
                horizontalLineTo(16.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5303f, 14.5303f)
                curveTo(11.8232f, 14.2374f, 11.8232f, 13.7626f, 11.5303f, 13.4697f)
                curveTo(11.2374f, 13.1768f, 10.7626f, 13.1768f, 10.4697f, 13.4697f)
                lineTo(9.8484f, 14.091f)
                curveTo(9.3715f, 14.5678f, 9.2715f, 14.6491f, 9.1657f, 14.6929f)
                curveTo(9.0599f, 14.7367f, 8.9317f, 14.75f, 8.2574f, 14.75f)
                horizontalLineTo(7.0f)
                curveTo(6.5858f, 14.75f, 6.25f, 15.0858f, 6.25f, 15.5f)
                curveTo(6.25f, 15.9142f, 6.5858f, 16.25f, 7.0f, 16.25f)
                horizontalLineTo(8.2574f)
                lineTo(8.3615f, 16.2501f)
                curveTo(8.8706f, 16.2509f, 9.3224f, 16.2516f, 9.7397f, 16.0787f)
                curveTo(10.157f, 15.9059f, 10.476f, 15.5859f, 10.8355f, 15.2253f)
                lineTo(10.909f, 15.1516f)
                lineTo(11.5303f, 14.5303f)
                close()
            }
        }
        .build()
        return _skateboardingRound!!
    }

private var _skateboardingRound: ImageVector? = null
