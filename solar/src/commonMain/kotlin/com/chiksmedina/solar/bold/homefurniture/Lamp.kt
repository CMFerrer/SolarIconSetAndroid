package com.chiksmedina.solar.bold.homefurniture

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.HomeFurnitureGroup

val HomeFurnitureGroup.Lamp: ImageVector
    get() {
        if (_lamp != null) {
            return _lamp!!
        }
        _lamp = Builder(
            name = "Lamp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.6675f, 3.1514f)
                curveTo(5.8814f, 3.9264f, 5.5769f, 5.0991f, 4.968f, 7.4445f)
                lineTo(4.8838f, 7.769f)
                curveTo(4.056f, 10.9576f, 3.6421f, 12.5519f, 4.3939f, 13.6719f)
                curveTo(4.4689f, 13.7837f, 4.5513f, 13.8902f, 4.6406f, 13.9909f)
                curveTo(5.5358f, 15.0f, 7.183f, 15.0f, 10.4772f, 15.0f)
                horizontalLineTo(11.2559f)
                verticalLineTo(21.25f)
                horizontalLineTo(9.0059f)
                curveTo(8.5917f, 21.25f, 8.2559f, 21.5858f, 8.2559f, 22.0f)
                curveTo(8.2559f, 22.4142f, 8.5917f, 22.75f, 9.0059f, 22.75f)
                horizontalLineTo(15.0059f)
                curveTo(15.4201f, 22.75f, 15.7559f, 22.4142f, 15.7559f, 22.0f)
                curveTo(15.7559f, 21.5858f, 15.4201f, 21.25f, 15.0059f, 21.25f)
                horizontalLineTo(12.7559f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.5358f)
                curveTo(14.8551f, 15.0f, 15.9102f, 15.0f, 16.7586f, 14.9352f)
                curveTo(16.7568f, 14.9565f, 16.7559f, 14.9782f, 16.7559f, 15.0f)
                verticalLineTo(17.0f)
                curveTo(16.7559f, 17.4142f, 17.0916f, 17.75f, 17.5059f, 17.75f)
                curveTo(17.9201f, 17.75f, 18.2559f, 17.4142f, 18.2559f, 17.0f)
                verticalLineTo(15.0f)
                verticalLineTo(14.6817f)
                curveTo(18.7241f, 14.5324f, 19.0866f, 14.3131f, 19.3724f, 13.9909f)
                curveTo(19.4617f, 13.8902f, 19.5441f, 13.7837f, 19.6191f, 13.6719f)
                curveTo(20.3709f, 12.5519f, 19.957f, 10.9576f, 19.1292f, 7.769f)
                lineTo(19.045f, 7.4445f)
                curveTo(18.4361f, 5.0991f, 18.1316f, 3.9264f, 17.3455f, 3.1514f)
                curveTo(17.1176f, 2.9268f, 16.8636f, 2.7303f, 16.5889f, 2.5662f)
                curveTo(15.6412f, 2.0f, 14.4297f, 2.0f, 12.0065f, 2.0f)
                curveTo(9.5833f, 2.0f, 8.3718f, 2.0f, 7.4241f, 2.5662f)
                curveTo(7.1494f, 2.7303f, 6.8954f, 2.9268f, 6.6675f, 3.1514f)
                close()
            }
        }
            .build()
        return _lamp!!
    }

private var _lamp: ImageVector? = null
