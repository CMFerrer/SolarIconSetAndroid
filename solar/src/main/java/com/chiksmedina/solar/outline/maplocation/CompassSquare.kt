package com.chiksmedina.solar.outline.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.MapLocationGroup

public val MapLocationGroup.CompassSquare: ImageVector
    get() {
        if (_compassSquare != null) {
            return _compassSquare!!
        }
        _compassSquare = Builder(name = "CompassSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.9426f, 1.25f)
                horizontalLineTo(12.0574f)
                curveTo(14.3658f, 1.25f, 16.1748f, 1.25f, 17.5863f, 1.4397f)
                curveTo(19.031f, 1.634f, 20.1711f, 2.0393f, 21.0659f, 2.9341f)
                curveTo(21.9607f, 3.8289f, 22.366f, 4.969f, 22.5603f, 6.4137f)
                curveTo(22.75f, 7.8252f, 22.75f, 9.6342f, 22.75f, 11.9426f)
                verticalLineTo(12.0574f)
                curveTo(22.75f, 14.3658f, 22.75f, 16.1748f, 22.5603f, 17.5863f)
                curveTo(22.366f, 19.031f, 21.9607f, 20.1711f, 21.0659f, 21.0659f)
                curveTo(20.1711f, 21.9607f, 19.031f, 22.366f, 17.5863f, 22.5603f)
                curveTo(16.1748f, 22.75f, 14.3658f, 22.75f, 12.0574f, 22.75f)
                horizontalLineTo(11.9426f)
                curveTo(9.6342f, 22.75f, 7.8252f, 22.75f, 6.4137f, 22.5603f)
                curveTo(4.969f, 22.366f, 3.8289f, 21.9607f, 2.9341f, 21.0659f)
                curveTo(2.0393f, 20.1711f, 1.634f, 19.031f, 1.4397f, 17.5863f)
                curveTo(1.25f, 16.1748f, 1.25f, 14.3658f, 1.25f, 12.0574f)
                verticalLineTo(11.9426f)
                curveTo(1.25f, 9.6342f, 1.25f, 7.8252f, 1.4397f, 6.4137f)
                curveTo(1.634f, 4.969f, 2.0393f, 3.8289f, 2.9341f, 2.9341f)
                curveTo(3.8289f, 2.0393f, 4.969f, 1.634f, 6.4137f, 1.4397f)
                curveTo(7.8252f, 1.25f, 9.6342f, 1.25f, 11.9426f, 1.25f)
                close()
                moveTo(6.6136f, 2.9264f)
                curveTo(5.3352f, 3.0982f, 4.5644f, 3.4251f, 3.9948f, 3.9948f)
                curveTo(3.4251f, 4.5644f, 3.0982f, 5.3352f, 2.9264f, 6.6136f)
                curveTo(2.7516f, 7.9136f, 2.75f, 9.6218f, 2.75f, 12.0f)
                curveTo(2.75f, 14.3782f, 2.7516f, 16.0864f, 2.9264f, 17.3864f)
                curveTo(3.0982f, 18.6648f, 3.4251f, 19.4355f, 3.9948f, 20.0052f)
                curveTo(4.5644f, 20.5749f, 5.3352f, 20.9018f, 6.6136f, 21.0736f)
                curveTo(7.9136f, 21.2484f, 9.6218f, 21.25f, 12.0f, 21.25f)
                curveTo(14.3782f, 21.25f, 16.0864f, 21.2484f, 17.3864f, 21.0736f)
                curveTo(18.6648f, 20.9018f, 19.4355f, 20.5749f, 20.0052f, 20.0052f)
                curveTo(20.5749f, 19.4355f, 20.9018f, 18.6648f, 21.0736f, 17.3864f)
                curveTo(21.2484f, 16.0864f, 21.25f, 14.3782f, 21.25f, 12.0f)
                curveTo(21.25f, 9.6218f, 21.2484f, 7.9136f, 21.0736f, 6.6136f)
                curveTo(20.9018f, 5.3352f, 20.5749f, 4.5644f, 20.0052f, 3.9948f)
                curveTo(19.4355f, 3.4251f, 18.6648f, 3.0982f, 17.3864f, 2.9264f)
                curveTo(16.0864f, 2.7516f, 14.3782f, 2.75f, 12.0f, 2.75f)
                curveTo(9.6218f, 2.75f, 7.9136f, 2.7516f, 6.6136f, 2.9264f)
                close()
                moveTo(13.8491f, 9.1814f)
                curveTo(13.2441f, 9.3418f, 12.4289f, 9.6664f, 11.2545f, 10.1361f)
                curveTo(10.713f, 10.3527f, 10.6123f, 10.4038f, 10.5381f, 10.4688f)
                curveTo(10.5135f, 10.4903f, 10.4903f, 10.5135f, 10.4688f, 10.5381f)
                curveTo(10.4038f, 10.6123f, 10.3527f, 10.713f, 10.1361f, 11.2545f)
                curveTo(9.6664f, 12.4289f, 9.3418f, 13.2441f, 9.1814f, 13.8491f)
                curveTo(9.0144f, 14.479f, 9.0962f, 14.64f, 9.1225f, 14.6787f)
                curveTo(9.1756f, 14.7569f, 9.2431f, 14.8244f, 9.3213f, 14.8775f)
                curveTo(9.36f, 14.9038f, 9.521f, 14.9856f, 10.1509f, 14.8186f)
                curveTo(10.7559f, 14.6582f, 11.5711f, 14.3336f, 12.7455f, 13.8639f)
                curveTo(13.287f, 13.6473f, 13.3877f, 13.5962f, 13.4619f, 13.5312f)
                curveTo(13.4865f, 13.5097f, 13.5097f, 13.4865f, 13.5312f, 13.4619f)
                curveTo(13.5962f, 13.3877f, 13.6473f, 13.287f, 13.8639f, 12.7455f)
                curveTo(14.3336f, 11.5711f, 14.6582f, 10.7559f, 14.8186f, 10.1509f)
                curveTo(14.9856f, 9.521f, 14.9038f, 9.36f, 14.8775f, 9.3213f)
                curveTo(14.8244f, 9.2431f, 14.7569f, 9.1756f, 14.6787f, 9.1225f)
                curveTo(14.64f, 9.0962f, 14.479f, 9.0144f, 13.8491f, 9.1814f)
                close()
                moveTo(13.4647f, 7.7315f)
                curveTo(14.1546f, 7.5486f, 14.9008f, 7.4599f, 15.5218f, 7.8818f)
                curveTo(15.7564f, 8.0413f, 15.9587f, 8.2436f, 16.1182f, 8.4782f)
                curveTo(16.5401f, 9.0992f, 16.4514f, 9.8455f, 16.2685f, 10.5353f)
                curveTo(16.0818f, 11.2396f, 15.7216f, 12.1401f, 15.2767f, 13.2523f)
                lineTo(15.2566f, 13.3026f)
                curveTo(15.2453f, 13.3308f, 15.2342f, 13.3588f, 15.2231f, 13.3865f)
                curveTo(15.06f, 13.796f, 14.9156f, 14.1583f, 14.659f, 14.4508f)
                curveTo(14.5943f, 14.5247f, 14.5247f, 14.5943f, 14.4508f, 14.659f)
                curveTo(14.1583f, 14.9156f, 13.796f, 15.06f, 13.3865f, 15.2231f)
                curveTo(13.3588f, 15.2342f, 13.3308f, 15.2453f, 13.3026f, 15.2566f)
                lineTo(13.2523f, 15.2767f)
                curveTo(12.1401f, 15.7216f, 11.2396f, 16.0818f, 10.5353f, 16.2685f)
                curveTo(9.8454f, 16.4514f, 9.0992f, 16.5401f, 8.4782f, 16.1182f)
                curveTo(8.2436f, 15.9587f, 8.0413f, 15.7564f, 7.8818f, 15.5218f)
                curveTo(7.4599f, 14.9008f, 7.5486f, 14.1546f, 7.7315f, 13.4647f)
                curveTo(7.9182f, 12.7604f, 8.2784f, 11.8599f, 8.7233f, 10.7477f)
                lineTo(8.7434f, 10.6974f)
                curveTo(8.7547f, 10.6692f, 8.7658f, 10.6412f, 8.7769f, 10.6135f)
                curveTo(8.94f, 10.204f, 9.0844f, 9.8417f, 9.341f, 9.5492f)
                curveTo(9.4057f, 9.4753f, 9.4753f, 9.4057f, 9.5492f, 9.341f)
                curveTo(9.8417f, 9.0844f, 10.204f, 8.94f, 10.6135f, 8.7769f)
                curveTo(10.6412f, 8.7658f, 10.6692f, 8.7547f, 10.6974f, 8.7434f)
                lineTo(10.7477f, 8.7233f)
                curveTo(11.8599f, 8.2784f, 12.7604f, 7.9182f, 13.4647f, 7.7315f)
                close()
            }
        }
        .build()
        return _compassSquare!!
    }

private var _compassSquare: ImageVector? = null
