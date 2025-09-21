package dev.chiksmedina.solar.lineduotone.security

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.SecurityGroup

val SecurityGroup.ShieldStar: ImageVector
    get() {
        if (_shieldStar != null) {
            return _shieldStar!!
        }
        _shieldStar = Builder(
            name = "ShieldStar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.0f, 10.4167f)
                curveTo(3.0f, 7.2191f, 3.0f, 5.6203f, 3.3775f, 5.0824f)
                curveTo(3.755f, 4.5445f, 5.2583f, 4.03f, 8.2649f, 3.0008f)
                lineTo(8.8377f, 2.8047f)
                curveTo(10.405f, 2.2682f, 11.1886f, 2.0f, 12.0f, 2.0f)
                curveTo(12.8114f, 2.0f, 13.595f, 2.2682f, 15.1623f, 2.8047f)
                lineTo(15.7351f, 3.0008f)
                curveTo(18.7417f, 4.03f, 20.245f, 4.5445f, 20.6225f, 5.0824f)
                curveTo(21.0f, 5.6203f, 21.0f, 7.2191f, 21.0f, 10.4167f)
                curveTo(21.0f, 10.8996f, 21.0f, 11.4234f, 21.0f, 11.9914f)
                curveTo(21.0f, 17.6294f, 16.761f, 20.3655f, 14.1014f, 21.5273f)
                curveTo(13.38f, 21.8424f, 13.0193f, 22.0f, 12.0f, 22.0f)
                curveTo(10.9807f, 22.0f, 10.62f, 21.8424f, 9.8986f, 21.5273f)
                curveTo(7.239f, 20.3655f, 3.0f, 17.6294f, 3.0f, 11.9914f)
                curveTo(3.0f, 11.4234f, 3.0f, 10.8996f, 3.0f, 10.4167f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.8613f, 8.3633f)
                curveTo(11.3679f, 7.4545f, 11.6213f, 7.0f, 12.0f, 7.0f)
                curveTo(12.3787f, 7.0f, 12.6321f, 7.4545f, 13.1387f, 8.3633f)
                lineTo(13.2698f, 8.5985f)
                curveTo(13.4138f, 8.8568f, 13.4858f, 8.9859f, 13.598f, 9.0711f)
                curveTo(13.7103f, 9.1563f, 13.8501f, 9.188f, 14.1296f, 9.2512f)
                lineTo(14.3842f, 9.3088f)
                curveTo(15.3681f, 9.5314f, 15.86f, 9.6427f, 15.977f, 10.0191f)
                curveTo(16.0941f, 10.3955f, 15.7587f, 10.7876f, 15.088f, 11.572f)
                lineTo(14.9144f, 11.7749f)
                curveTo(14.7238f, 11.9978f, 14.6285f, 12.1092f, 14.5857f, 12.2471f)
                curveTo(14.5428f, 12.385f, 14.5572f, 12.5336f, 14.586f, 12.831f)
                lineTo(14.6122f, 13.1018f)
                curveTo(14.7136f, 14.1482f, 14.7644f, 14.6715f, 14.4579f, 14.9041f)
                curveTo(14.1515f, 15.1367f, 13.6909f, 14.9246f, 12.7697f, 14.5005f)
                lineTo(12.5314f, 14.3907f)
                curveTo(12.2696f, 14.2702f, 12.1387f, 14.2099f, 12.0f, 14.2099f)
                curveTo(11.8613f, 14.2099f, 11.7304f, 14.2702f, 11.4686f, 14.3907f)
                lineTo(11.2303f, 14.5005f)
                curveTo(10.3091f, 14.9246f, 9.8485f, 15.1367f, 9.5421f, 14.9041f)
                curveTo(9.2357f, 14.6715f, 9.2864f, 14.1482f, 9.3878f, 13.1018f)
                lineTo(9.414f, 12.831f)
                curveTo(9.4428f, 12.5336f, 9.4572f, 12.385f, 9.4143f, 12.2471f)
                curveTo(9.3715f, 12.1092f, 9.2762f, 11.9978f, 9.0856f, 11.7749f)
                lineTo(8.912f, 11.572f)
                curveTo(8.2413f, 10.7876f, 7.9059f, 10.3955f, 8.023f, 10.0191f)
                curveTo(8.14f, 9.6427f, 8.6319f, 9.5314f, 9.6158f, 9.3088f)
                lineTo(9.8703f, 9.2512f)
                curveTo(10.1499f, 9.188f, 10.2897f, 9.1563f, 10.402f, 9.0711f)
                curveTo(10.5142f, 8.9859f, 10.5862f, 8.8568f, 10.7302f, 8.5985f)
                lineTo(10.8613f, 8.3633f)
                close()
            }
        }
            .build()
        return _shieldStar!!
    }

private var _shieldStar: ImageVector? = null
