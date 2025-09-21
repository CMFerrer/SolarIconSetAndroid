package dev.chiksmedina.solar.bold.transportpartsservice

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
import dev.chiksmedina.solar.bold.TransportPartsServiceGroup

val TransportPartsServiceGroup.Tram: ImageVector
    get() {
        if (_tram != null) {
            return _tram!!
        }
        _tram = Builder(
            name = "Tram", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF1C274C)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(6.3756f, 19.5723f)
                curveTo(5.898f, 19.4016f, 5.5058f, 19.1627f, 5.1716f, 18.8285f)
                curveTo(4.1972f, 17.8542f, 4.0332f, 16.386f, 4.0056f, 13.7501f)
                horizontalLineTo(19.9944f)
                curveTo(19.9668f, 16.386f, 19.8028f, 17.8542f, 18.8284f, 18.8285f)
                curveTo(18.4943f, 19.1626f, 18.1021f, 19.4015f, 17.6247f, 19.5722f)
                lineTo(18.671f, 21.6649f)
                curveTo(18.8562f, 22.0353f, 18.7061f, 22.4858f, 18.3356f, 22.6711f)
                curveTo(17.9651f, 22.8563f, 17.5146f, 22.7062f, 17.3293f, 22.3357f)
                lineTo(16.1054f, 19.8878f)
                curveTo(15.057f, 20.0001f, 13.726f, 20.0001f, 12.0f, 20.0001f)
                curveTo(10.2742f, 20.0001f, 8.9432f, 20.0001f, 7.8949f, 19.8878f)
                lineTo(6.671f, 22.3357f)
                curveTo(6.4857f, 22.7062f, 6.0352f, 22.8563f, 5.6648f, 22.6711f)
                curveTo(5.2943f, 22.4858f, 5.1441f, 22.0353f, 5.3293f, 21.6649f)
                lineTo(6.3756f, 19.5723f)
                close()
                moveTo(14.75f, 16.0001f)
                curveTo(14.75f, 15.5859f, 15.0858f, 15.2501f, 15.5f, 15.2501f)
                horizontalLineTo(17.0f)
                curveTo(17.4142f, 15.2501f, 17.75f, 15.5859f, 17.75f, 16.0001f)
                curveTo(17.75f, 16.4143f, 17.4142f, 16.7501f, 17.0f, 16.7501f)
                horizontalLineTo(15.5f)
                curveTo(15.0858f, 16.7501f, 14.75f, 16.4143f, 14.75f, 16.0001f)
                close()
                moveTo(7.0f, 15.2501f)
                curveTo(6.5858f, 15.2501f, 6.25f, 15.5859f, 6.25f, 16.0001f)
                curveTo(6.25f, 16.4143f, 6.5858f, 16.7501f, 7.0f, 16.7501f)
                horizontalLineTo(8.5f)
                curveTo(8.9142f, 16.7501f, 9.25f, 16.4143f, 9.25f, 16.0001f)
                curveTo(9.25f, 15.5859f, 8.9142f, 15.2501f, 8.5f, 15.2501f)
                horizontalLineTo(7.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF1C274C)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(20.0f, 12.2501f)
                verticalLineTo(10.0001f)
                curveTo(20.0f, 6.2289f, 20.0f, 4.3432f, 18.8284f, 3.1717f)
                curveTo(17.9495f, 2.2928f, 16.6688f, 2.0732f, 14.4917f, 2.0184f)
                curveTo(14.2216f, 2.0116f, 14.0f, 2.2299f, 14.0f, 2.5001f)
                curveTo(14.0f, 3.6047f, 13.1046f, 4.5001f, 12.0f, 4.5001f)
                curveTo(10.8954f, 4.5001f, 10.0f, 3.6047f, 10.0f, 2.5001f)
                curveTo(10.0f, 2.2299f, 9.7785f, 2.0116f, 9.5084f, 2.0184f)
                curveTo(7.3312f, 2.0732f, 6.0505f, 2.2928f, 5.1716f, 3.1717f)
                curveTo(4.0f, 4.3432f, 4.0f, 6.2289f, 4.0f, 10.0001f)
                verticalLineTo(12.2501f)
                horizontalLineTo(20.0f)
                close()
            }
        }
            .build()
        return _tram!!
    }

private var _tram: ImageVector? = null
