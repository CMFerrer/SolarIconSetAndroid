package dev.chiksmedina.solar.outline.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.AstronomyGroup

val AstronomyGroup.BlackHole3: ImageVector
    get() {
        if (_blackHole3 != null) {
            return _blackHole3!!
        }
        _blackHole3 = Builder(
            name = "BlackHole3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.013f, 13.9011f)
                curveTo(9.5612f, 13.5111f, 9.1989f, 13.0109f, 8.9276f, 12.4529f)
                curveTo(8.3013f, 11.1645f, 8.1155f, 9.5072f, 8.3439f, 7.8948f)
                curveTo(8.7985f, 4.6859f, 10.9957f, 1.25f, 15.3115f, 1.25f)
                curveTo(15.7257f, 1.25f, 16.0615f, 1.5858f, 16.0615f, 2.0f)
                curveTo(16.0615f, 2.4142f, 15.7257f, 2.75f, 15.3115f, 2.75f)
                curveTo(12.0274f, 2.75f, 10.2245f, 5.3141f, 9.8291f, 8.1052f)
                curveTo(9.7204f, 8.8724f, 9.7258f, 9.6258f, 9.8314f, 10.3087f)
                curveTo(9.9134f, 10.2038f, 10.0028f, 10.1049f, 10.0989f, 10.013f)
                curveTo(10.4889f, 9.5612f, 10.9891f, 9.1989f, 11.5471f, 8.9276f)
                curveTo(12.8355f, 8.3013f, 14.4928f, 8.1155f, 16.1052f, 8.3439f)
                curveTo(19.3142f, 8.7985f, 22.75f, 10.9957f, 22.75f, 15.3115f)
                curveTo(22.75f, 15.7257f, 22.4142f, 16.0615f, 22.0f, 16.0615f)
                curveTo(21.5858f, 16.0615f, 21.25f, 15.7257f, 21.25f, 15.3115f)
                curveTo(21.25f, 12.0274f, 18.6858f, 10.2245f, 15.8948f, 9.8291f)
                curveTo(15.2064f, 9.7316f, 14.5291f, 9.7259f, 13.9039f, 9.802f)
                curveTo(14.5432f, 10.2171f, 15.0377f, 10.835f, 15.3839f, 11.5471f)
                curveTo(16.0102f, 12.8355f, 16.196f, 14.4928f, 15.9676f, 16.1052f)
                curveTo(15.513f, 19.3142f, 13.3158f, 22.75f, 9.0f, 22.75f)
                curveTo(8.5858f, 22.75f, 8.25f, 22.4142f, 8.25f, 22.0f)
                curveTo(8.25f, 21.5858f, 8.5858f, 21.25f, 9.0f, 21.25f)
                curveTo(12.2842f, 21.25f, 14.087f, 18.6858f, 14.4824f, 15.8948f)
                curveTo(14.6034f, 15.041f, 14.583f, 14.2041f, 14.4405f, 13.4626f)
                curveTo(14.0493f, 14.3192f, 13.3211f, 14.9619f, 12.4529f, 15.3839f)
                curveTo(11.1645f, 16.0102f, 9.5072f, 16.196f, 7.8948f, 15.9676f)
                curveTo(4.6859f, 15.513f, 1.25f, 13.3158f, 1.25f, 9.0f)
                curveTo(1.25f, 8.5858f, 1.5858f, 8.25f, 2.0f, 8.25f)
                curveTo(2.4142f, 8.25f, 2.75f, 8.5858f, 2.75f, 9.0f)
                curveTo(2.75f, 12.2842f, 5.3141f, 14.087f, 8.1052f, 14.4824f)
                curveTo(9.0134f, 14.6111f, 9.9023f, 14.5798f, 10.6778f, 14.4118f)
                curveTo(10.4306f, 14.276f, 10.2065f, 14.1033f, 10.013f, 13.9011f)
                close()
                moveTo(12.1335f, 13.243f)
                curveTo(11.728f, 13.2105f, 11.367f, 13.0658f, 11.0539f, 12.817f)
                curveTo(10.8919f, 12.6295f, 10.7846f, 12.3934f, 10.757f, 12.1335f)
                curveTo(10.7895f, 11.728f, 10.9342f, 11.367f, 11.183f, 11.0539f)
                curveTo(11.4021f, 10.8646f, 11.6877f, 10.75f, 12.0f, 10.75f)
                curveTo(12.6904f, 10.75f, 13.25f, 11.3096f, 13.25f, 12.0f)
                curveTo(13.25f, 12.6453f, 12.7611f, 13.1764f, 12.1335f, 13.243f)
                close()
            }
        }
            .build()
        return _blackHole3!!
    }

private var _blackHole3: ImageVector? = null
