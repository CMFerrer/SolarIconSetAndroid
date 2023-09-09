package com.chiksmedina.solar.outline.electronicdevices

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
import com.chiksmedina.solar.outline.ElectronicDevicesGroup

public val ElectronicDevicesGroup.Lightning: ImageVector
    get() {
        if (_lightning != null) {
            return _lightning!!
        }
        _lightning = Builder(name = "Lightning", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.25f, 5.0f)
                curveTo(10.25f, 4.5858f, 10.5858f, 4.25f, 11.0f, 4.25f)
                horizontalLineTo(13.0f)
                curveTo(13.4142f, 4.25f, 13.75f, 4.5858f, 13.75f, 5.0f)
                curveTo(13.75f, 5.4142f, 13.4142f, 5.75f, 13.0f, 5.75f)
                horizontalLineTo(11.0f)
                curveTo(10.5858f, 5.75f, 10.25f, 5.4142f, 10.25f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.6f, 12.45f)
                curveTo(12.8485f, 12.1186f, 12.7814f, 11.6485f, 12.45f, 11.4f)
                curveTo(12.1186f, 11.1515f, 11.6485f, 11.2186f, 11.4f, 11.55f)
                lineTo(9.9f, 13.55f)
                curveTo(9.7296f, 13.7773f, 9.7021f, 14.0813f, 9.8292f, 14.3354f)
                curveTo(9.9562f, 14.5895f, 10.2159f, 14.75f, 10.5f, 14.75f)
                horizontalLineTo(12.0f)
                lineTo(11.4f, 15.55f)
                curveTo(11.1515f, 15.8814f, 11.2186f, 16.3515f, 11.55f, 16.6f)
                curveTo(11.8814f, 16.8485f, 12.3515f, 16.7814f, 12.6f, 16.45f)
                lineTo(14.1f, 14.45f)
                curveTo(14.2705f, 14.2227f, 14.2979f, 13.9187f, 14.1708f, 13.6646f)
                curveTo(14.0438f, 13.4105f, 13.7841f, 13.25f, 13.5f, 13.25f)
                horizontalLineTo(12.0f)
                lineTo(12.6f, 12.45f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.9617f, 1.25f)
                curveTo(11.2921f, 1.25f, 10.7333f, 1.25f, 10.281f, 1.296f)
                curveTo(9.8076f, 1.3441f, 9.3682f, 1.4489f, 8.9722f, 1.7135f)
                curveTo(8.6719f, 1.9141f, 8.4141f, 2.1719f, 8.2135f, 2.4722f)
                curveTo(7.9489f, 2.8682f, 7.8442f, 3.3075f, 7.796f, 3.781f)
                curveTo(7.75f, 4.2333f, 7.75f, 4.7921f, 7.75f, 5.4617f)
                lineTo(7.75f, 7.3939f)
                curveTo(7.1473f, 7.5088f, 6.6155f, 7.7258f, 6.1767f, 8.1579f)
                curveTo(5.6606f, 8.6662f, 5.4443f, 9.3034f, 5.3448f, 10.0323f)
                curveTo(5.2499f, 10.7268f, 5.25f, 11.605f, 5.25f, 12.6733f)
                verticalLineTo(15.3267f)
                curveTo(5.25f, 16.395f, 5.2499f, 17.2732f, 5.3448f, 17.9677f)
                curveTo(5.4443f, 18.6967f, 5.6606f, 19.3338f, 6.1767f, 19.8421f)
                curveTo(6.6912f, 20.3487f, 7.3334f, 20.5597f, 8.0681f, 20.657f)
                curveTo(8.771f, 20.75f, 9.6607f, 20.75f, 10.7472f, 20.75f)
                horizontalLineTo(11.25f)
                verticalLineTo(22.0f)
                curveTo(11.25f, 22.4142f, 11.5858f, 22.75f, 12.0f, 22.75f)
                curveTo(12.4142f, 22.75f, 12.75f, 22.4142f, 12.75f, 22.0f)
                verticalLineTo(20.75f)
                horizontalLineTo(13.2527f)
                curveTo(14.3392f, 20.75f, 15.229f, 20.75f, 15.9319f, 20.657f)
                curveTo(16.6666f, 20.5597f, 17.3089f, 20.3487f, 17.8233f, 19.8421f)
                curveTo(18.3394f, 19.3338f, 18.5557f, 18.6967f, 18.6552f, 17.9677f)
                curveTo(18.7501f, 17.2732f, 18.75f, 16.395f, 18.75f, 15.3267f)
                verticalLineTo(12.6733f)
                curveTo(18.75f, 11.605f, 18.7501f, 10.7268f, 18.6552f, 10.0323f)
                curveTo(18.5557f, 9.3034f, 18.3394f, 8.6662f, 17.8233f, 8.1579f)
                curveTo(17.3845f, 7.7258f, 16.8528f, 7.5088f, 16.25f, 7.3939f)
                lineTo(16.25f, 5.4617f)
                curveTo(16.25f, 4.7921f, 16.25f, 4.2333f, 16.204f, 3.781f)
                curveTo(16.1559f, 3.3075f, 16.0511f, 2.8682f, 15.7865f, 2.4722f)
                curveTo(15.5859f, 2.1719f, 15.3281f, 1.9141f, 15.0278f, 1.7135f)
                curveTo(14.6318f, 1.4489f, 14.1925f, 1.3441f, 13.719f, 1.296f)
                curveTo(13.2667f, 1.25f, 12.7079f, 1.25f, 12.0384f, 1.25f)
                horizontalLineTo(11.9617f)
                close()
                moveTo(14.75f, 7.262f)
                verticalLineTo(5.5f)
                curveTo(14.75f, 4.7822f, 14.7491f, 4.3002f, 14.7117f, 3.9328f)
                curveTo(14.6756f, 3.578f, 14.6118f, 3.414f, 14.5393f, 3.3055f)
                curveTo(14.4481f, 3.169f, 14.331f, 3.0519f, 14.1945f, 2.9607f)
                curveTo(14.086f, 2.8882f, 13.922f, 2.8244f, 13.5672f, 2.7883f)
                curveTo(13.1998f, 2.7509f, 12.7178f, 2.75f, 12.0f, 2.75f)
                curveTo(11.2822f, 2.75f, 10.8002f, 2.7509f, 10.4328f, 2.7883f)
                curveTo(10.078f, 2.8244f, 9.914f, 2.8882f, 9.8055f, 2.9607f)
                curveTo(9.6691f, 3.0519f, 9.5519f, 3.169f, 9.4607f, 3.3055f)
                curveTo(9.3882f, 3.414f, 9.3244f, 3.578f, 9.2883f, 3.9328f)
                curveTo(9.2509f, 4.3002f, 9.25f, 4.7822f, 9.25f, 5.5f)
                verticalLineTo(7.262f)
                curveTo(9.6997f, 7.25f, 10.1984f, 7.25f, 10.7473f, 7.25f)
                horizontalLineTo(13.2527f)
                curveTo(13.8016f, 7.25f, 14.3003f, 7.25f, 14.75f, 7.262f)
                close()
                moveTo(15.735f, 19.17f)
                curveTo(15.1421f, 19.2485f, 14.3523f, 19.25f, 13.2f, 19.25f)
                horizontalLineTo(10.8f)
                curveTo(9.6477f, 19.25f, 8.8579f, 19.2485f, 8.265f, 19.17f)
                curveTo(7.6925f, 19.0942f, 7.4177f, 18.959f, 7.2292f, 18.7733f)
                curveTo(7.0423f, 18.5893f, 6.9072f, 18.3232f, 6.831f, 17.7648f)
                curveTo(6.7516f, 17.1837f, 6.75f, 16.4085f, 6.75f, 15.2727f)
                verticalLineTo(12.7273f)
                curveTo(6.75f, 11.5915f, 6.7516f, 10.8163f, 6.831f, 10.2352f)
                curveTo(6.9072f, 9.6768f, 7.0423f, 9.4107f, 7.2292f, 9.2267f)
                curveTo(7.4177f, 9.041f, 7.6925f, 8.9059f, 8.265f, 8.8301f)
                curveTo(8.8579f, 8.7515f, 9.6477f, 8.75f, 10.8f, 8.75f)
                horizontalLineTo(13.2f)
                curveTo(14.3523f, 8.75f, 15.1421f, 8.7515f, 15.735f, 8.8301f)
                curveTo(16.3075f, 8.9059f, 16.5823f, 9.041f, 16.7708f, 9.2267f)
                curveTo(16.9577f, 9.4107f, 17.0928f, 9.6768f, 17.169f, 10.2352f)
                curveTo(17.2484f, 10.8163f, 17.25f, 11.5915f, 17.25f, 12.7273f)
                verticalLineTo(15.2727f)
                curveTo(17.25f, 16.4085f, 17.2484f, 17.1837f, 17.169f, 17.7648f)
                curveTo(17.0928f, 18.3232f, 16.9577f, 18.5893f, 16.7708f, 18.7733f)
                curveTo(16.5823f, 18.959f, 16.3075f, 19.0942f, 15.735f, 19.17f)
                close()
            }
        }
        .build()
        return _lightning!!
    }

private var _lightning: ImageVector? = null
