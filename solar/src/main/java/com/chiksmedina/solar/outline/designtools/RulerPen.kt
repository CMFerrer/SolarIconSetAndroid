package com.chiksmedina.solar.outline.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.DesignToolsGroup

public val DesignToolsGroup.RulerPen: ImageVector
    get() {
        if (_rulerPen != null) {
            return _rulerPen!!
        }
        _rulerPen = Builder(name = "RulerPen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.948f, 1.25f)
                lineTo(18.052f, 1.25f)
                curveTo(18.9505f, 1.25f, 19.6997f, 1.25f, 20.2945f, 1.3299f)
                curveTo(20.9223f, 1.4143f, 21.4891f, 1.6f, 21.9446f, 2.0555f)
                curveTo(22.4f, 2.5109f, 22.5857f, 3.0777f, 22.6701f, 3.7055f)
                curveTo(22.7501f, 4.3003f, 22.75f, 5.0495f, 22.75f, 5.948f)
                verticalLineTo(18.052f)
                curveTo(22.75f, 18.9505f, 22.7501f, 19.6997f, 22.6701f, 20.2945f)
                curveTo(22.5857f, 20.9223f, 22.4f, 21.4891f, 21.9446f, 21.9445f)
                curveTo(21.4891f, 22.4f, 20.9223f, 22.5857f, 20.2945f, 22.6701f)
                curveTo(19.6997f, 22.7501f, 18.9505f, 22.75f, 18.052f, 22.75f)
                horizontalLineTo(15.948f)
                curveTo(15.0495f, 22.75f, 14.3003f, 22.7501f, 13.7055f, 22.6701f)
                curveTo(13.0777f, 22.5857f, 12.5109f, 22.4f, 12.0555f, 21.9445f)
                curveTo(11.6f, 21.4891f, 11.4143f, 20.9223f, 11.3299f, 20.2945f)
                curveTo(11.2499f, 19.6997f, 11.25f, 18.9505f, 11.25f, 18.052f)
                verticalLineTo(5.948f)
                curveTo(11.25f, 5.0495f, 11.2499f, 4.3003f, 11.3299f, 3.7055f)
                curveTo(11.4143f, 3.0777f, 11.6f, 2.5109f, 12.0555f, 2.0555f)
                curveTo(12.5109f, 1.6f, 13.0777f, 1.4143f, 13.7055f, 1.3299f)
                curveTo(14.3003f, 1.25f, 15.0495f, 1.25f, 15.948f, 1.25f)
                close()
                moveTo(12.75f, 9.75f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 9.75f, 15.75f, 9.4142f, 15.75f, 9.0f)
                curveTo(15.75f, 8.5858f, 15.4142f, 8.25f, 15.0f, 8.25f)
                horizontalLineTo(12.75f)
                verticalLineTo(6.75f)
                lineTo(14.0f, 6.75f)
                curveTo(14.4142f, 6.75f, 14.75f, 6.4142f, 14.75f, 6.0f)
                curveTo(14.75f, 5.5858f, 14.4142f, 5.25f, 14.0f, 5.25f)
                lineTo(12.7518f, 5.25f)
                curveTo(12.756f, 4.6806f, 12.7701f, 4.2509f, 12.8165f, 3.9054f)
                curveTo(12.8786f, 3.4439f, 12.9858f, 3.2464f, 13.1161f, 3.1161f)
                curveTo(13.2464f, 2.9858f, 13.4439f, 2.8786f, 13.9054f, 2.8165f)
                curveTo(14.3884f, 2.7516f, 15.036f, 2.75f, 16.0f, 2.75f)
                lineTo(18.0f, 2.75f)
                curveTo(18.964f, 2.75f, 19.6116f, 2.7516f, 20.0946f, 2.8165f)
                curveTo(20.5561f, 2.8786f, 20.7536f, 2.9858f, 20.8839f, 3.1161f)
                curveTo(21.0142f, 3.2464f, 21.1214f, 3.4439f, 21.1835f, 3.9054f)
                curveTo(21.2484f, 4.3884f, 21.25f, 5.036f, 21.25f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(21.25f, 18.964f, 21.2484f, 19.6116f, 21.1835f, 20.0946f)
                curveTo(21.1214f, 20.5561f, 21.0142f, 20.7536f, 20.8839f, 20.8839f)
                curveTo(20.7536f, 21.0142f, 20.5561f, 21.1214f, 20.0946f, 21.1835f)
                curveTo(19.6116f, 21.2484f, 18.964f, 21.25f, 18.0f, 21.25f)
                horizontalLineTo(16.0f)
                curveTo(15.036f, 21.25f, 14.3884f, 21.2484f, 13.9054f, 21.1835f)
                curveTo(13.4439f, 21.1214f, 13.2464f, 21.0142f, 13.1161f, 20.8839f)
                curveTo(12.9858f, 20.7536f, 12.8786f, 20.5561f, 12.8165f, 20.0946f)
                curveTo(12.7701f, 19.7491f, 12.756f, 19.3194f, 12.7518f, 18.75f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 18.75f, 14.75f, 18.4142f, 14.75f, 18.0f)
                curveTo(14.75f, 17.5858f, 14.4142f, 17.25f, 14.0f, 17.25f)
                horizontalLineTo(12.75f)
                verticalLineTo(15.75f)
                lineTo(15.0f, 15.75f)
                curveTo(15.4142f, 15.75f, 15.75f, 15.4142f, 15.75f, 15.0f)
                curveTo(15.75f, 14.5858f, 15.4142f, 14.25f, 15.0f, 14.25f)
                lineTo(12.75f, 14.25f)
                verticalLineTo(12.75f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 12.75f, 14.75f, 12.4142f, 14.75f, 12.0f)
                curveTo(14.75f, 11.5858f, 14.4142f, 11.25f, 14.0f, 11.25f)
                horizontalLineTo(12.75f)
                verticalLineTo(9.75f)
                close()
                moveTo(1.25f, 4.85f)
                curveTo(1.25f, 2.826f, 2.9657f, 1.25f, 5.0f, 1.25f)
                curveTo(7.0344f, 1.25f, 8.75f, 2.826f, 8.75f, 4.85f)
                lineTo(8.75f, 15.5847f)
                curveTo(8.75f, 16.1279f, 8.7501f, 16.4692f, 8.706f, 16.8082f)
                curveTo(8.654f, 17.2074f, 8.5565f, 17.5996f, 8.4153f, 17.9779f)
                curveTo(8.2956f, 18.2988f, 8.1355f, 18.603f, 7.8795f, 19.0893f)
                lineTo(6.3873f, 21.9245f)
                curveTo(6.114f, 22.4438f, 5.5704f, 22.75f, 5.0f, 22.75f)
                curveTo(4.4296f, 22.75f, 3.886f, 22.4438f, 3.6127f, 21.9245f)
                lineTo(2.1205f, 19.0893f)
                curveTo(1.8645f, 18.603f, 1.7044f, 18.2989f, 1.5847f, 17.9779f)
                curveTo(1.4435f, 17.5996f, 1.346f, 17.2074f, 1.294f, 16.8082f)
                curveTo(1.2499f, 16.4692f, 1.25f, 16.1279f, 1.25f, 15.5847f)
                lineTo(1.25f, 4.85f)
                close()
                moveTo(5.0f, 2.75f)
                curveTo(3.7206f, 2.75f, 2.75f, 3.726f, 2.75f, 4.85f)
                lineTo(2.75f, 5.405f)
                curveTo(2.8464f, 5.4622f, 2.9671f, 5.5277f, 3.1107f, 5.5938f)
                curveTo(3.5483f, 5.7954f, 4.1912f, 6.0f, 5.0f, 6.0f)
                curveTo(5.8088f, 6.0f, 6.4517f, 5.7954f, 6.8894f, 5.5938f)
                curveTo(7.0329f, 5.5277f, 7.1536f, 5.4622f, 7.25f, 5.405f)
                lineTo(7.25f, 4.85f)
                curveTo(7.25f, 3.726f, 6.2794f, 2.75f, 5.0f, 2.75f)
                close()
                moveTo(7.25f, 7.071f)
                curveTo(6.6772f, 7.3006f, 5.9158f, 7.5f, 5.0f, 7.5f)
                curveTo(4.0842f, 7.5f, 3.3228f, 7.3006f, 2.75f, 7.071f)
                lineTo(2.75f, 15.5338f)
                curveTo(2.75f, 16.1439f, 2.7514f, 16.3836f, 2.7815f, 16.6146f)
                curveTo(2.8187f, 16.9002f, 2.8885f, 17.1815f, 2.99f, 17.4535f)
                curveTo(3.0723f, 17.6741f, 3.1845f, 17.8903f, 3.4716f, 18.4357f)
                lineTo(4.4408f, 20.2771f)
                horizontalLineTo(5.5593f)
                lineTo(6.5284f, 18.4357f)
                curveTo(6.8155f, 17.8903f, 6.9277f, 17.6741f, 7.01f, 17.4535f)
                curveTo(7.1115f, 17.1815f, 7.1814f, 16.9002f, 7.2185f, 16.6146f)
                curveTo(7.2486f, 16.3836f, 7.25f, 16.1439f, 7.25f, 15.5338f)
                lineTo(7.25f, 7.071f)
                close()
                moveTo(2.4797f, 5.2234f)
                lineTo(2.481f, 5.2245f)
                curveTo(2.4793f, 5.2232f, 2.4793f, 5.2231f, 2.4797f, 5.2234f)
                close()
                moveTo(7.5184f, 5.225f)
                lineTo(7.5203f, 5.2235f)
                curveTo(7.52f, 5.2237f, 7.5194f, 5.2242f, 7.5184f, 5.225f)
                close()
            }
        }
        .build()
        return _rulerPen!!
    }

private var _rulerPen: ImageVector? = null
