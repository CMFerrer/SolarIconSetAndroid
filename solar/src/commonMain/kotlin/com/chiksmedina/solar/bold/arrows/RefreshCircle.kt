package com.chiksmedina.solar.bold.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.ArrowsGroup

val ArrowsGroup.RefreshCircle: ImageVector
    get() {
        if (_refreshCircle != null) {
            return _refreshCircle!!
        }
        _refreshCircle = Builder(
            name = "RefreshCircle", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                close()
                moveTo(5.4606f, 11.0833f)
                curveTo(5.8333f, 7.7999f, 8.624f, 5.25f, 12.0096f, 5.25f)
                curveTo(14.148f, 5.25f, 16.0489f, 6.2679f, 17.2521f, 7.8425f)
                curveTo(17.5036f, 8.1716f, 17.4406f, 8.6423f, 17.1115f, 8.8938f)
                curveTo(16.7824f, 9.1453f, 16.3117f, 9.0823f, 16.0602f, 8.7532f)
                curveTo(15.1289f, 7.5345f, 13.6613f, 6.75f, 12.0096f, 6.75f)
                curveTo(9.4521f, 6.75f, 7.3364f, 8.6322f, 6.9733f, 11.0833f)
                horizontalLineTo(7.3365f)
                curveTo(7.64f, 11.0833f, 7.9135f, 11.2662f, 8.0295f, 11.5466f)
                curveTo(8.1456f, 11.8269f, 8.0812f, 12.1496f, 7.8665f, 12.364f)
                lineTo(6.6982f, 13.5307f)
                curveTo(6.4054f, 13.8231f, 5.9311f, 13.8231f, 5.6383f, 13.5307f)
                lineTo(4.47f, 12.364f)
                curveTo(4.2553f, 12.1496f, 4.191f, 11.8269f, 4.307f, 11.5466f)
                curveTo(4.423f, 11.2662f, 4.6966f, 11.0833f, 5.0f, 11.0833f)
                horizontalLineTo(5.4606f)
                close()
                moveTo(18.3617f, 10.4693f)
                curveTo(18.0689f, 10.1769f, 17.5946f, 10.1769f, 17.3018f, 10.4693f)
                lineTo(16.1335f, 11.636f)
                curveTo(15.9188f, 11.8504f, 15.8545f, 12.1731f, 15.9705f, 12.4534f)
                curveTo(16.0865f, 12.7338f, 16.3601f, 12.9167f, 16.6635f, 12.9167f)
                horizontalLineTo(17.0267f)
                curveTo(16.6636f, 15.3678f, 14.5479f, 17.25f, 11.9905f, 17.25f)
                curveTo(10.3464f, 17.25f, 8.8848f, 16.4729f, 7.9529f, 15.2638f)
                curveTo(7.7f, 14.9358f, 7.2291f, 14.8748f, 6.901f, 15.1277f)
                curveTo(6.5729f, 15.3806f, 6.512f, 15.8515f, 6.7649f, 16.1796f)
                curveTo(7.9689f, 17.7416f, 9.8621f, 18.75f, 11.9905f, 18.75f)
                curveTo(15.376f, 18.75f, 18.1667f, 16.2001f, 18.5395f, 12.9167f)
                horizontalLineTo(19.0f)
                curveTo(19.3035f, 12.9167f, 19.577f, 12.7338f, 19.693f, 12.4534f)
                curveTo(19.8091f, 12.1731f, 19.7447f, 11.8504f, 19.53f, 11.636f)
                lineTo(18.3617f, 10.4693f)
                close()
            }
        }
            .build()
        return _refreshCircle!!
    }

private var _refreshCircle: ImageVector? = null
