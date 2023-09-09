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

public val MapLocationGroup.MapPointRotate: ImageVector
    get() {
        if (_mapPointRotate != null) {
            return _mapPointRotate!!
        }
        _mapPointRotate = Builder(name = "MapPointRotate", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.25f, 8.1075f)
                curveTo(5.25f, 4.3328f, 8.2596f, 1.25f, 12.0f, 1.25f)
                curveTo(15.7404f, 1.25f, 18.75f, 4.3328f, 18.75f, 8.1075f)
                curveTo(18.75f, 9.9148f, 18.2356f, 11.85f, 17.3281f, 13.5209f)
                curveTo(16.4221f, 15.1891f, 15.0919f, 16.6514f, 13.4148f, 17.4353f)
                curveTo(12.517f, 17.8549f, 11.483f, 17.8549f, 10.5852f, 17.4353f)
                curveTo(8.9081f, 16.6514f, 7.5779f, 15.1891f, 6.6719f, 13.5209f)
                curveTo(5.7645f, 11.85f, 5.25f, 9.9148f, 5.25f, 8.1075f)
                close()
                moveTo(12.0f, 2.75f)
                curveTo(9.113f, 2.75f, 6.75f, 5.136f, 6.75f, 8.1075f)
                curveTo(6.75f, 9.6468f, 7.193f, 11.3375f, 7.99f, 12.805f)
                curveTo(8.7885f, 14.2752f, 9.9097f, 15.4638f, 11.2204f, 16.0764f)
                curveTo(11.7156f, 16.3079f, 12.2844f, 16.3079f, 12.7796f, 16.0764f)
                curveTo(14.0903f, 15.4638f, 15.2115f, 14.2752f, 16.01f, 12.805f)
                curveTo(16.8069f, 11.3375f, 17.25f, 9.6468f, 17.25f, 8.1075f)
                curveTo(17.25f, 5.136f, 14.887f, 2.75f, 12.0f, 2.75f)
                close()
                moveTo(12.0f, 6.75f)
                curveTo(11.3096f, 6.75f, 10.75f, 7.3096f, 10.75f, 8.0f)
                curveTo(10.75f, 8.6904f, 11.3096f, 9.25f, 12.0f, 9.25f)
                curveTo(12.6904f, 9.25f, 13.25f, 8.6904f, 13.25f, 8.0f)
                curveTo(13.25f, 7.3096f, 12.6904f, 6.75f, 12.0f, 6.75f)
                close()
                moveTo(9.25f, 8.0f)
                curveTo(9.25f, 6.4812f, 10.4812f, 5.25f, 12.0f, 5.25f)
                curveTo(13.5188f, 5.25f, 14.75f, 6.4812f, 14.75f, 8.0f)
                curveTo(14.75f, 9.5188f, 13.5188f, 10.75f, 12.0f, 10.75f)
                curveTo(10.4812f, 10.75f, 9.25f, 9.5188f, 9.25f, 8.0f)
                close()
                moveTo(3.6273f, 14.5342f)
                curveTo(3.8846f, 14.8589f, 3.8299f, 15.3306f, 3.5052f, 15.5878f)
                curveTo(2.9316f, 16.0424f, 2.75f, 16.443f, 2.75f, 16.75f)
                curveTo(2.75f, 16.993f, 2.8603f, 17.288f, 3.1906f, 17.6296f)
                curveTo(3.5244f, 17.9747f, 4.0458f, 18.3252f, 4.7556f, 18.6471f)
                curveTo(6.0098f, 19.2159f, 7.7435f, 19.6466f, 9.75f, 19.8343f)
                verticalLineTo(19.375f)
                curveTo(9.75f, 19.0807f, 9.9221f, 18.8136f, 10.1901f, 18.692f)
                curveTo(10.4581f, 18.5704f, 10.7724f, 18.6168f, 10.9939f, 18.8106f)
                lineTo(12.4939f, 20.1231f)
                curveTo(12.6566f, 20.2655f, 12.75f, 20.4712f, 12.75f, 20.6875f)
                curveTo(12.75f, 20.9038f, 12.6566f, 21.1095f, 12.4939f, 21.2519f)
                lineTo(10.9939f, 22.5644f)
                curveTo(10.7724f, 22.7582f, 10.4581f, 22.8046f, 10.1901f, 22.683f)
                curveTo(9.9221f, 22.5614f, 9.75f, 22.2943f, 9.75f, 22.0f)
                verticalLineTo(21.3404f)
                curveTo(7.5651f, 21.1487f, 5.6093f, 20.6813f, 4.136f, 20.0131f)
                curveTo(3.3221f, 19.644f, 2.6207f, 19.1979f, 2.1124f, 18.6724f)
                curveTo(1.6008f, 18.1434f, 1.25f, 17.494f, 1.25f, 16.75f)
                curveTo(1.25f, 15.7998f, 1.8167f, 15.012f, 2.5737f, 14.4122f)
                curveTo(2.8984f, 14.1549f, 3.3701f, 14.2096f, 3.6273f, 14.5342f)
                close()
                moveTo(20.3727f, 14.5342f)
                curveTo(20.6299f, 14.2096f, 21.1016f, 14.1549f, 21.4263f, 14.4122f)
                curveTo(22.1833f, 15.012f, 22.75f, 15.7998f, 22.75f, 16.75f)
                curveTo(22.75f, 18.1281f, 21.5819f, 19.1606f, 20.2034f, 19.8514f)
                curveTo(18.7617f, 20.5738f, 16.791f, 21.0851f, 14.5756f, 21.3096f)
                curveTo(14.1635f, 21.3514f, 13.7956f, 21.0512f, 13.7538f, 20.6391f)
                curveTo(13.7121f, 20.227f, 14.0123f, 19.859f, 14.4244f, 19.8173f)
                curveTo(16.522f, 19.6047f, 18.3014f, 19.1266f, 19.5314f, 18.5103f)
                curveTo(20.8246f, 17.8623f, 21.25f, 17.2066f, 21.25f, 16.75f)
                curveTo(21.25f, 16.443f, 21.0684f, 16.0424f, 20.4948f, 15.5878f)
                curveTo(20.1701f, 15.3306f, 20.1155f, 14.8589f, 20.3727f, 14.5342f)
                close()
            }
        }
        .build()
        return _mapPointRotate!!
    }

private var _mapPointRotate: ImageVector? = null
