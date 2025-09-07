package com.chiksmedina.solar.outline.homefurniture

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.HomeFurnitureGroup

val HomeFurnitureGroup.Sofa3: ImageVector
    get() {
        if (_sofa3 != null) {
            return _sofa3!!
        }
        _sofa3 = Builder(
            name = "Sofa3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.9397f, 3.25f)
                horizontalLineTo(12.0603f)
                curveTo(14.2498f, 3.25f, 15.9723f, 3.25f, 17.2936f, 3.4325f)
                curveTo(18.6439f, 3.6189f, 19.7186f, 4.0127f, 20.4898f, 4.9163f)
                curveTo(20.5795f, 5.0214f, 20.6646f, 5.1304f, 20.7448f, 5.2429f)
                curveTo(21.4343f, 6.2102f, 21.5557f, 7.3483f, 21.4091f, 8.7036f)
                curveTo(21.278f, 9.9156f, 20.9177f, 11.4159f, 20.4513f, 13.2868f)
                curveTo(21.7554f, 13.5021f, 22.75f, 14.6349f, 22.75f, 16.0f)
                curveTo(22.75f, 17.2588f, 21.9043f, 18.32f, 20.75f, 18.6465f)
                verticalLineTo(20.0f)
                curveTo(20.75f, 20.4142f, 20.4142f, 20.75f, 20.0f, 20.75f)
                curveTo(19.5858f, 20.75f, 19.25f, 20.4142f, 19.25f, 20.0f)
                verticalLineTo(18.75f)
                horizontalLineTo(4.75f)
                lineTo(4.75f, 20.0f)
                curveTo(4.75f, 20.4142f, 4.4142f, 20.75f, 4.0f, 20.75f)
                curveTo(3.5858f, 20.75f, 3.25f, 20.4142f, 3.25f, 20.0f)
                lineTo(3.25f, 18.6465f)
                curveTo(2.0958f, 18.32f, 1.25f, 17.2588f, 1.25f, 16.0f)
                curveTo(1.25f, 14.6349f, 2.2446f, 13.5021f, 3.5487f, 13.2868f)
                curveTo(3.0823f, 11.4159f, 2.722f, 9.9156f, 2.5909f, 8.7036f)
                curveTo(2.4443f, 7.3483f, 2.5657f, 6.2102f, 3.2552f, 5.2429f)
                curveTo(3.3354f, 5.1304f, 3.4205f, 5.0214f, 3.5102f, 4.9163f)
                curveTo(4.2814f, 4.0127f, 5.3561f, 3.6189f, 6.7064f, 3.4325f)
                curveTo(8.0277f, 3.25f, 9.7502f, 3.25f, 11.9397f, 3.25f)
                close()
                moveTo(5.0856f, 13.25f)
                horizontalLineTo(18.9144f)
                curveTo(19.4278f, 11.1946f, 19.7923f, 9.7031f, 19.9178f, 8.5422f)
                curveTo(20.047f, 7.3483f, 19.9047f, 6.6484f, 19.5234f, 6.1136f)
                curveTo(19.4685f, 6.0366f, 19.4103f, 5.962f, 19.3489f, 5.8901f)
                curveTo(18.9224f, 5.3905f, 18.278f, 5.0826f, 17.0884f, 4.9184f)
                curveTo(15.8817f, 4.7517f, 14.263f, 4.75f, 12.0f, 4.75f)
                curveTo(9.737f, 4.75f, 8.1183f, 4.7517f, 6.9116f, 4.9184f)
                curveTo(5.722f, 5.0826f, 5.0776f, 5.3904f, 4.6511f, 5.8901f)
                curveTo(4.5897f, 5.962f, 4.5315f, 6.0366f, 4.4766f, 6.1136f)
                curveTo(4.0953f, 6.6484f, 3.953f, 7.3483f, 4.0822f, 8.5422f)
                curveTo(4.2077f, 9.7031f, 4.5722f, 11.1946f, 5.0856f, 13.25f)
                close()
                moveTo(4.0f, 14.75f)
                curveTo(3.3096f, 14.75f, 2.75f, 15.3096f, 2.75f, 16.0f)
                curveTo(2.75f, 16.6904f, 3.3096f, 17.25f, 4.0f, 17.25f)
                horizontalLineTo(20.0f)
                curveTo(20.6904f, 17.25f, 21.25f, 16.6904f, 21.25f, 16.0f)
                curveTo(21.25f, 15.3096f, 20.6904f, 14.75f, 20.0f, 14.75f)
                horizontalLineTo(4.0f)
                close()
            }
        }
            .build()
        return _sofa3!!
    }

private var _sofa3: ImageVector? = null
