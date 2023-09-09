package com.chiksmedina.solar.bold.facesemotionsstickers

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
import com.chiksmedina.solar.bold.FacesEmotionsStickersGroup

public val FacesEmotionsStickersGroup.FacemaskCircle: ImageVector
    get() {
        if (_facemaskCircle != null) {
            return _facemaskCircle!!
        }
        _facemaskCircle = Builder(name = "FacemaskCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.8239f, 13.8782f)
                lineTo(17.712f, 15.5226f)
                lineTo(17.3321f, 20.4614f)
                curveTo(19.6316f, 19.0093f, 21.298f, 16.6457f, 21.8239f, 13.8782f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.7657f, 21.2667f)
                lineTo(16.21f, 15.4914f)
                lineTo(13.5784f, 14.4387f)
                curveTo(12.5652f, 14.0334f, 11.4348f, 14.0334f, 10.4216f, 14.4387f)
                lineTo(7.79f, 15.4914f)
                lineTo(8.2343f, 21.2667f)
                curveTo(9.3966f, 21.7395f, 10.6679f, 22.0f, 12.0f, 22.0f)
                curveTo(13.3321f, 22.0f, 14.6034f, 21.7395f, 15.7657f, 21.2667f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.6679f, 20.4614f)
                lineTo(6.2893f, 15.5392f)
                lineTo(2.2117f, 14.0568f)
                curveTo(2.7742f, 16.7473f, 4.4181f, 19.0406f, 6.6679f, 20.4614f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.9982f, 12.193f)
                curveTo(21.9994f, 12.1288f, 22.0f, 12.0645f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 12.1294f, 2.0025f, 12.2582f, 2.0073f, 12.3864f)
                lineTo(6.9872f, 14.1969f)
                lineTo(9.8645f, 13.046f)
                curveTo(11.2354f, 12.4977f, 12.7646f, 12.4977f, 14.1355f, 13.046f)
                lineTo(17.0f, 14.1918f)
                lineTo(21.9982f, 12.193f)
                close()
                moveTo(16.0f, 10.5f)
                curveTo(16.0f, 11.3284f, 15.5523f, 12.0f, 15.0f, 12.0f)
                curveTo(14.4477f, 12.0f, 14.0f, 11.3284f, 14.0f, 10.5f)
                curveTo(14.0f, 9.6716f, 14.4477f, 9.0f, 15.0f, 9.0f)
                curveTo(15.5523f, 9.0f, 16.0f, 9.6716f, 16.0f, 10.5f)
                close()
                moveTo(9.0f, 12.0f)
                curveTo(9.5523f, 12.0f, 10.0f, 11.3284f, 10.0f, 10.5f)
                curveTo(10.0f, 9.6716f, 9.5523f, 9.0f, 9.0f, 9.0f)
                curveTo(8.4477f, 9.0f, 8.0f, 9.6716f, 8.0f, 10.5f)
                curveTo(8.0f, 11.3284f, 8.4477f, 12.0f, 9.0f, 12.0f)
                close()
            }
        }
        .build()
        return _facemaskCircle!!
    }

private var _facemaskCircle: ImageVector? = null
