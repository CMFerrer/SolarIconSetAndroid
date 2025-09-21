package dev.chiksmedina.solar.outline.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.DesignToolsGroup

val DesignToolsGroup.ThreeSquares: ImageVector
    get() {
        if (_threeSquares != null) {
            return _threeSquares!!
        }
        _threeSquares = Builder(
            name = "ThreeSquares", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(15.948f, 1.25f)
                horizontalLineTo(18.052f)
                curveTo(18.9505f, 1.25f, 19.6997f, 1.25f, 20.2945f, 1.3299f)
                curveTo(20.9223f, 1.4143f, 21.4891f, 1.6f, 21.9445f, 2.0555f)
                curveTo(22.4f, 2.5109f, 22.5857f, 3.0777f, 22.6701f, 3.7055f)
                curveTo(22.7501f, 4.3003f, 22.75f, 5.0495f, 22.75f, 5.948f)
                verticalLineTo(8.052f)
                curveTo(22.75f, 8.9505f, 22.7501f, 9.6997f, 22.6701f, 10.2945f)
                curveTo(22.5857f, 10.9223f, 22.4f, 11.4891f, 21.9445f, 11.9445f)
                curveTo(21.4891f, 12.4f, 20.9223f, 12.5857f, 20.2945f, 12.6701f)
                curveTo(19.6997f, 12.7501f, 18.9505f, 12.75f, 18.052f, 12.75f)
                lineTo(17.75f, 12.75f)
                lineTo(17.75f, 13.052f)
                curveTo(17.75f, 13.9505f, 17.7501f, 14.6997f, 17.6701f, 15.2945f)
                curveTo(17.5857f, 15.9223f, 17.4f, 16.4891f, 16.9445f, 16.9445f)
                curveTo(16.4891f, 17.4f, 15.9223f, 17.5857f, 15.2945f, 17.6701f)
                curveTo(14.6997f, 17.7501f, 13.9505f, 17.75f, 13.052f, 17.75f)
                lineTo(12.75f, 17.75f)
                lineTo(12.75f, 18.052f)
                curveTo(12.75f, 18.9505f, 12.7501f, 19.6997f, 12.6701f, 20.2945f)
                curveTo(12.5857f, 20.9223f, 12.4f, 21.4891f, 11.9445f, 21.9445f)
                curveTo(11.4891f, 22.4f, 10.9223f, 22.5857f, 10.2945f, 22.6701f)
                curveTo(9.6997f, 22.7501f, 8.9505f, 22.75f, 8.052f, 22.75f)
                horizontalLineTo(5.948f)
                curveTo(5.0495f, 22.75f, 4.3003f, 22.7501f, 3.7055f, 22.6701f)
                curveTo(3.0777f, 22.5857f, 2.5109f, 22.4f, 2.0555f, 21.9445f)
                curveTo(1.6f, 21.4891f, 1.4143f, 20.9223f, 1.3299f, 20.2945f)
                curveTo(1.25f, 19.6997f, 1.25f, 18.9505f, 1.25f, 18.052f)
                verticalLineTo(15.948f)
                curveTo(1.25f, 15.0495f, 1.25f, 14.3003f, 1.3299f, 13.7055f)
                curveTo(1.4143f, 13.0777f, 1.6f, 12.5109f, 2.0555f, 12.0555f)
                curveTo(2.5109f, 11.6f, 3.0777f, 11.4143f, 3.7055f, 11.3299f)
                curveTo(4.3003f, 11.2499f, 5.0495f, 11.25f, 5.948f, 11.25f)
                lineTo(6.25f, 11.25f)
                lineTo(6.25f, 10.948f)
                curveTo(6.25f, 10.0495f, 6.2499f, 9.3003f, 6.3299f, 8.7055f)
                curveTo(6.4143f, 8.0777f, 6.6f, 7.5109f, 7.0555f, 7.0555f)
                curveTo(7.5109f, 6.6f, 8.0777f, 6.4143f, 8.7055f, 6.3299f)
                curveTo(9.3003f, 6.2499f, 10.0495f, 6.25f, 10.948f, 6.25f)
                lineTo(11.25f, 6.25f)
                lineTo(11.25f, 5.948f)
                curveTo(11.25f, 5.0495f, 11.2499f, 4.3003f, 11.3299f, 3.7055f)
                curveTo(11.4143f, 3.0777f, 11.6f, 2.5109f, 12.0555f, 2.0555f)
                curveTo(12.5109f, 1.6f, 13.0777f, 1.4143f, 13.7055f, 1.3299f)
                curveTo(14.3003f, 1.25f, 15.0495f, 1.25f, 15.948f, 1.25f)
                close()
                moveTo(11.25f, 7.75f)
                horizontalLineTo(11.0f)
                curveTo(10.036f, 7.75f, 9.3884f, 7.7516f, 8.9054f, 7.8165f)
                curveTo(8.4439f, 7.8786f, 8.2464f, 7.9858f, 8.1161f, 8.1161f)
                curveTo(7.9858f, 8.2464f, 7.8786f, 8.4439f, 7.8165f, 8.9054f)
                curveTo(7.7516f, 9.3884f, 7.75f, 10.036f, 7.75f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(7.75f, 13.964f, 7.7516f, 14.6116f, 7.8165f, 15.0946f)
                curveTo(7.8786f, 15.5561f, 7.9858f, 15.7536f, 8.1161f, 15.8839f)
                curveTo(8.2464f, 16.0142f, 8.4439f, 16.1214f, 8.9054f, 16.1835f)
                curveTo(9.3884f, 16.2484f, 10.036f, 16.25f, 11.0f, 16.25f)
                horizontalLineTo(13.0f)
                curveTo(13.964f, 16.25f, 14.6116f, 16.2484f, 15.0946f, 16.1835f)
                curveTo(15.5561f, 16.1214f, 15.7536f, 16.0142f, 15.8839f, 15.8839f)
                curveTo(16.0142f, 15.7536f, 16.1214f, 15.5561f, 16.1835f, 15.0946f)
                curveTo(16.2484f, 14.6116f, 16.25f, 13.964f, 16.25f, 13.0f)
                verticalLineTo(12.75f)
                lineTo(15.948f, 12.75f)
                curveTo(15.0495f, 12.75f, 14.3003f, 12.7501f, 13.7055f, 12.6701f)
                curveTo(13.0777f, 12.5857f, 12.5109f, 12.4f, 12.0555f, 11.9445f)
                curveTo(11.6f, 11.4891f, 11.4143f, 10.9223f, 11.3299f, 10.2945f)
                curveTo(11.2499f, 9.6997f, 11.25f, 8.9505f, 11.25f, 8.052f)
                lineTo(11.25f, 7.75f)
                close()
                moveTo(6.25f, 12.75f)
                horizontalLineTo(6.0f)
                curveTo(5.036f, 12.75f, 4.3884f, 12.7516f, 3.9054f, 12.8165f)
                curveTo(3.4439f, 12.8786f, 3.2464f, 12.9858f, 3.1161f, 13.1161f)
                curveTo(2.9858f, 13.2464f, 2.8786f, 13.4439f, 2.8165f, 13.9054f)
                curveTo(2.7516f, 14.3884f, 2.75f, 15.036f, 2.75f, 16.0f)
                verticalLineTo(18.0f)
                curveTo(2.75f, 18.964f, 2.7516f, 19.6116f, 2.8165f, 20.0946f)
                curveTo(2.8786f, 20.5561f, 2.9858f, 20.7536f, 3.1161f, 20.8839f)
                curveTo(3.2464f, 21.0142f, 3.4439f, 21.1214f, 3.9054f, 21.1835f)
                curveTo(4.3884f, 21.2484f, 5.036f, 21.25f, 6.0f, 21.25f)
                horizontalLineTo(8.0f)
                curveTo(8.964f, 21.25f, 9.6116f, 21.2484f, 10.0946f, 21.1835f)
                curveTo(10.5561f, 21.1214f, 10.7536f, 21.0142f, 10.8839f, 20.8839f)
                curveTo(11.0142f, 20.7536f, 11.1214f, 20.5561f, 11.1835f, 20.0946f)
                curveTo(11.2484f, 19.6116f, 11.25f, 18.964f, 11.25f, 18.0f)
                verticalLineTo(17.75f)
                lineTo(10.948f, 17.75f)
                curveTo(10.0495f, 17.75f, 9.3003f, 17.7501f, 8.7055f, 17.6701f)
                curveTo(8.0777f, 17.5857f, 7.5109f, 17.4f, 7.0555f, 16.9445f)
                curveTo(6.6f, 16.4891f, 6.4143f, 15.9223f, 6.3299f, 15.2945f)
                curveTo(6.2499f, 14.6997f, 6.25f, 13.9505f, 6.25f, 13.052f)
                lineTo(6.25f, 12.75f)
                close()
                moveTo(13.9054f, 2.8165f)
                curveTo(13.4439f, 2.8786f, 13.2464f, 2.9858f, 13.1161f, 3.1161f)
                curveTo(12.9858f, 3.2464f, 12.8786f, 3.4439f, 12.8165f, 3.9054f)
                curveTo(12.7516f, 4.3884f, 12.75f, 5.036f, 12.75f, 6.0f)
                verticalLineTo(8.0f)
                curveTo(12.75f, 8.964f, 12.7516f, 9.6116f, 12.8165f, 10.0946f)
                curveTo(12.8786f, 10.5561f, 12.9858f, 10.7536f, 13.1161f, 10.8839f)
                curveTo(13.2464f, 11.0142f, 13.4439f, 11.1214f, 13.9054f, 11.1835f)
                curveTo(14.3884f, 11.2484f, 15.036f, 11.25f, 16.0f, 11.25f)
                horizontalLineTo(18.0f)
                curveTo(18.964f, 11.25f, 19.6116f, 11.2484f, 20.0946f, 11.1835f)
                curveTo(20.5561f, 11.1214f, 20.7536f, 11.0142f, 20.8839f, 10.8839f)
                curveTo(21.0142f, 10.7536f, 21.1214f, 10.5561f, 21.1835f, 10.0946f)
                curveTo(21.2484f, 9.6116f, 21.25f, 8.964f, 21.25f, 8.0f)
                verticalLineTo(6.0f)
                curveTo(21.25f, 5.036f, 21.2484f, 4.3884f, 21.1835f, 3.9054f)
                curveTo(21.1214f, 3.4439f, 21.0142f, 3.2464f, 20.8839f, 3.1161f)
                curveTo(20.7536f, 2.9858f, 20.5561f, 2.8786f, 20.0946f, 2.8165f)
                curveTo(19.6116f, 2.7516f, 18.964f, 2.75f, 18.0f, 2.75f)
                horizontalLineTo(16.0f)
                curveTo(15.036f, 2.75f, 14.3884f, 2.7516f, 13.9054f, 2.8165f)
                close()
            }
        }
            .build()
        return _threeSquares!!
    }

private var _threeSquares: ImageVector? = null
