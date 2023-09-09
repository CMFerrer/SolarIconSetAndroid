package com.chiksmedina.solar.boldduotone.electronicdevices

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
import com.chiksmedina.solar.boldduotone.ElectronicDevicesGroup

public val ElectronicDevicesGroup.Projector: ImageVector
    get() {
        if (_projector != null) {
            return _projector!!
        }
        _projector = Builder(name = "Projector", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.25f, 9.4999f)
                curveTo(6.2499f, 9.0857f, 5.9141f, 8.75f, 5.4999f, 8.75f)
                curveTo(5.0857f, 8.75f, 4.7499f, 9.0859f, 4.75f, 9.5001f)
                lineTo(4.7502f, 11.0002f)
                curveTo(4.7502f, 11.4144f, 5.0861f, 11.7502f, 5.5003f, 11.7501f)
                curveTo(5.9145f, 11.75f, 6.2502f, 11.4142f, 6.2502f, 11.0f)
                lineTo(6.25f, 9.4999f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.0f, 9.0f)
                curveTo(19.0f, 11.7614f, 16.7614f, 14.0f, 14.0f, 14.0f)
                curveTo(11.2386f, 14.0f, 9.0f, 11.7614f, 9.0f, 9.0f)
                curveTo(9.0f, 6.2386f, 11.2386f, 4.0f, 14.0f, 4.0f)
                curveTo(16.7614f, 4.0f, 19.0f, 6.2386f, 19.0f, 9.0f)
                close()
                moveTo(13.25f, 7.0f)
                curveTo(13.25f, 6.5858f, 13.5858f, 6.25f, 14.0f, 6.25f)
                curveTo(15.5188f, 6.25f, 16.75f, 7.4812f, 16.75f, 9.0f)
                curveTo(16.75f, 10.5188f, 15.5188f, 11.75f, 14.0f, 11.75f)
                curveTo(12.4812f, 11.75f, 11.25f, 10.5188f, 11.25f, 9.0f)
                curveTo(11.25f, 8.5858f, 11.5858f, 8.25f, 12.0f, 8.25f)
                curveTo(12.4142f, 8.25f, 12.75f, 8.5858f, 12.75f, 9.0f)
                curveTo(12.75f, 9.6904f, 13.3096f, 10.25f, 14.0f, 10.25f)
                curveTo(14.6904f, 10.25f, 15.25f, 9.6904f, 15.25f, 9.0f)
                curveTo(15.25f, 8.3096f, 14.6904f, 7.75f, 14.0f, 7.75f)
                curveTo(13.5858f, 7.75f, 13.25f, 7.4142f, 13.25f, 7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 14.0f)
                curveTo(16.7614f, 14.0f, 19.0f, 11.7614f, 19.0f, 9.0f)
                curveTo(19.0f, 7.8823f, 18.6333f, 6.8503f, 18.0136f, 6.0177f)
                curveTo(18.7706f, 6.041f, 19.3783f, 6.0946f, 19.8765f, 6.2185f)
                curveTo(20.3952f, 6.3474f, 20.7951f, 6.5525f, 21.1213f, 6.8787f)
                curveTo(22.0f, 7.7574f, 22.0f, 9.1716f, 22.0f, 12.0f)
                curveTo(22.0f, 14.8284f, 22.0f, 16.2426f, 21.1213f, 17.1213f)
                curveTo(20.5744f, 17.6682f, 19.82f, 17.8747f, 18.6463f, 17.9527f)
                lineTo(19.6431f, 19.6141f)
                curveTo(19.8562f, 19.9693f, 19.7411f, 20.43f, 19.3859f, 20.6431f)
                curveTo(19.0307f, 20.8562f, 18.57f, 20.7411f, 18.3569f, 20.3859f)
                lineTo(16.9245f, 17.9986f)
                curveTo(16.6343f, 18.0f, 16.3266f, 18.0f, 16.0f, 18.0f)
                horizontalLineTo(8.0f)
                curveTo(7.6734f, 18.0f, 7.3657f, 18.0f, 7.0754f, 17.9986f)
                lineTo(5.6431f, 20.3859f)
                curveTo(5.43f, 20.7411f, 4.9693f, 20.8562f, 4.6141f, 20.6431f)
                curveTo(4.2589f, 20.43f, 4.1438f, 19.9693f, 4.3569f, 19.6141f)
                lineTo(5.3537f, 17.9527f)
                curveTo(4.18f, 17.8747f, 3.4256f, 17.6682f, 2.8787f, 17.1213f)
                curveTo(2.0f, 16.2426f, 2.0f, 14.8284f, 2.0f, 12.0f)
                curveTo(2.0f, 9.1716f, 2.0f, 7.7574f, 2.8787f, 6.8787f)
                curveTo(3.7574f, 6.0f, 5.1716f, 6.0f, 8.0f, 6.0f)
                horizontalLineTo(9.9996f)
                curveTo(9.3719f, 6.8357f, 9.0f, 7.8744f, 9.0f, 9.0f)
                curveTo(9.0f, 11.7614f, 11.2386f, 14.0f, 14.0f, 14.0f)
                close()
            }
        }
        .build()
        return _projector!!
    }

private var _projector: ImageVector? = null
