package dev.chiksmedina.solar.outline.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.SportsGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(15.0f, 2.75f)
                curveTo(14.3096f, 2.75f, 13.75f, 3.3096f, 13.75f, 4.0f)
                curveTo(13.75f, 4.6904f, 14.3096f, 5.25f, 15.0f, 5.25f)
                curveTo(15.6904f, 5.25f, 16.25f, 4.6904f, 16.25f, 4.0f)
                curveTo(16.25f, 3.3096f, 15.6904f, 2.75f, 15.0f, 2.75f)
                close()
                moveTo(12.25f, 4.0f)
                curveTo(12.25f, 2.4812f, 13.4812f, 1.25f, 15.0f, 1.25f)
                curveTo(16.5188f, 1.25f, 17.75f, 2.4812f, 17.75f, 4.0f)
                curveTo(17.75f, 5.5188f, 16.5188f, 6.75f, 15.0f, 6.75f)
                curveTo(13.4812f, 6.75f, 12.25f, 5.5188f, 12.25f, 4.0f)
                close()
                moveTo(6.21f, 6.0468f)
                curveTo(7.6038f, 5.1757f, 9.3359f, 5.0423f, 10.8467f, 5.6898f)
                curveTo(12.0283f, 6.1962f, 12.3248f, 7.7358f, 11.4158f, 8.6449f)
                lineTo(9.7618f, 10.2988f)
                curveTo(9.4124f, 10.6483f, 9.4384f, 11.2224f, 9.8181f, 11.5388f)
                lineTo(10.8145f, 12.3691f)
                curveTo(11.4073f, 12.8631f, 11.75f, 13.5949f, 11.75f, 14.3665f)
                verticalLineTo(16.0f)
                curveTo(11.75f, 16.4142f, 11.4142f, 16.75f, 11.0f, 16.75f)
                curveTo(10.5858f, 16.75f, 10.25f, 16.4142f, 10.25f, 16.0f)
                verticalLineTo(14.3665f)
                curveTo(10.25f, 14.04f, 10.105f, 13.7304f, 9.8542f, 13.5215f)
                lineTo(8.8578f, 12.6911f)
                curveTo(7.8005f, 11.8101f, 7.728f, 10.2113f, 8.7012f, 9.2382f)
                lineTo(10.3551f, 7.5842f)
                curveTo(10.5138f, 7.4255f, 10.462f, 7.1568f, 10.2558f, 7.0685f)
                curveTo(9.1966f, 6.6145f, 7.9822f, 6.708f, 7.005f, 7.3188f)
                lineTo(4.8975f, 8.636f)
                curveTo(4.5462f, 8.8555f, 4.0835f, 8.7487f, 3.864f, 8.3975f)
                curveTo(3.6445f, 8.0463f, 3.7513f, 7.5835f, 4.1025f, 7.364f)
                lineTo(6.21f, 6.0468f)
                close()
                moveTo(22.7354f, 6.8529f)
                curveTo(22.8167f, 7.2591f, 22.5533f, 7.6542f, 22.1471f, 7.7354f)
                lineTo(21.0244f, 7.96f)
                curveTo(20.6749f, 8.0299f, 20.4737f, 8.0712f, 20.3294f, 8.1173f)
                curveTo(20.2644f, 8.1381f, 20.2314f, 8.1538f, 20.2159f, 8.1626f)
                curveTo(20.2086f, 8.1666f, 20.2055f, 8.169f, 20.2047f, 8.1695f)
                lineTo(20.2037f, 8.1704f)
                lineTo(20.2029f, 8.1714f)
                curveTo(20.2024f, 8.1722f, 20.2002f, 8.1755f, 20.1965f, 8.1829f)
                curveTo(20.1885f, 8.1988f, 20.1744f, 8.2325f, 20.1568f, 8.2985f)
                curveTo(20.1178f, 8.4449f, 20.0862f, 8.6478f, 20.0333f, 9.0003f)
                lineTo(18.9423f, 16.2737f)
                curveTo(20.9318f, 15.9353f, 22.75f, 17.4682f, 22.75f, 19.4888f)
                curveTo(22.75f, 21.2899f, 21.2899f, 22.75f, 19.4888f, 22.75f)
                horizontalLineTo(3.0868f)
                curveTo(2.0724f, 22.75f, 1.25f, 21.9276f, 1.25f, 20.9132f)
                curveTo(1.25f, 20.0209f, 1.8913f, 19.2576f, 2.7702f, 19.1038f)
                lineTo(17.3847f, 16.5463f)
                lineTo(18.5551f, 8.7435f)
                curveTo(18.601f, 8.4374f, 18.6441f, 8.1494f, 18.7076f, 7.9117f)
                curveTo(18.7782f, 7.6469f, 18.8906f, 7.3741f, 19.1177f, 7.1358f)
                curveTo(19.3447f, 6.8975f, 19.6117f, 6.772f, 19.8728f, 6.6885f)
                curveTo(20.1072f, 6.6136f, 20.3927f, 6.5566f, 20.6963f, 6.4959f)
                lineTo(21.8529f, 6.2646f)
                curveTo(22.2591f, 6.1833f, 22.6542f, 6.4467f, 22.7354f, 6.8529f)
                close()
                moveTo(11.75f, 10.0f)
                curveTo(11.75f, 9.5858f, 12.0858f, 9.25f, 12.5f, 9.25f)
                horizontalLineTo(15.5f)
                curveTo(15.9142f, 9.25f, 16.25f, 9.5858f, 16.25f, 10.0f)
                curveTo(16.25f, 10.4142f, 15.9142f, 10.75f, 15.5f, 10.75f)
                horizontalLineTo(12.5f)
                curveTo(12.0858f, 10.75f, 11.75f, 10.4142f, 11.75f, 10.0f)
                close()
                moveTo(6.1412f, 13.7981f)
                lineTo(6.4697f, 13.4697f)
                lineTo(7.5303f, 14.5303f)
                lineTo(7.2019f, 14.8588f)
                curveTo(7.1731f, 14.8876f, 7.1446f, 14.9161f, 7.1165f, 14.9443f)
                curveTo(6.623f, 15.4387f, 6.2324f, 15.8301f, 5.7239f, 16.0407f)
                curveTo(5.2155f, 16.2513f, 4.6626f, 16.2507f, 3.964f, 16.2501f)
                curveTo(3.9242f, 16.25f, 3.8839f, 16.25f, 3.8431f, 16.25f)
                horizontalLineTo(3.0f)
                verticalLineTo(14.75f)
                horizontalLineTo(3.8431f)
                curveTo(4.7218f, 14.75f, 4.9523f, 14.7367f, 5.1499f, 14.6549f)
                curveTo(5.3476f, 14.573f, 5.5199f, 14.4194f, 6.1412f, 13.7981f)
                close()
                moveTo(21.25f, 19.4888f)
                curveTo(21.25f, 18.3947f, 20.2629f, 17.5654f, 19.1852f, 17.754f)
                lineTo(3.0288f, 20.5814f)
                curveTo(2.8676f, 20.6096f, 2.75f, 20.7495f, 2.75f, 20.9132f)
                curveTo(2.75f, 21.0992f, 2.9008f, 21.25f, 3.0868f, 21.25f)
                horizontalLineTo(19.4888f)
                curveTo(20.4615f, 21.25f, 21.25f, 20.4615f, 21.25f, 19.4888f)
                close()
            }
        }
            .build()
        return _treadmill!!
    }

private var _treadmill: ImageVector? = null
