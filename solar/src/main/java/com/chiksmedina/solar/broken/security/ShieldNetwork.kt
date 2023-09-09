package com.chiksmedina.solar.broken.security

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.SecurityGroup

public val SecurityGroup.ShieldNetwork: ImageVector
    get() {
        if (_shieldNetwork != null) {
            return _shieldNetwork!!
        }
        _shieldNetwork = Builder(name = "ShieldNetwork", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 12.0f)
                curveTo(17.0f, 12.6566f, 16.8707f, 13.3068f, 16.6194f, 13.9134f)
                curveTo(16.3681f, 14.52f, 15.9998f, 15.0712f, 15.5355f, 15.5355f)
                curveTo(15.0712f, 15.9998f, 14.52f, 16.3681f, 13.9134f, 16.6194f)
                curveTo(13.3068f, 16.8707f, 12.6566f, 17.0f, 12.0f, 17.0f)
                curveTo(11.3434f, 17.0f, 10.6932f, 16.8707f, 10.0866f, 16.6194f)
                curveTo(9.4799f, 16.3681f, 8.9288f, 15.9998f, 8.4645f, 15.5355f)
                curveTo(8.0002f, 15.0712f, 7.6319f, 14.52f, 7.3806f, 13.9134f)
                curveTo(7.1293f, 13.3068f, 7.0f, 12.6566f, 7.0f, 12.0f)
                curveTo(7.0f, 11.3434f, 7.1293f, 10.6932f, 7.3806f, 10.0866f)
                curveTo(7.6319f, 9.4799f, 8.0002f, 8.9288f, 8.4645f, 8.4645f)
                curveTo(8.9288f, 8.0002f, 9.48f, 7.6319f, 10.0866f, 7.3806f)
                curveTo(10.6932f, 7.1293f, 11.3434f, 7.0f, 12.0f, 7.0f)
                curveTo(12.6566f, 7.0f, 13.3068f, 7.1293f, 13.9134f, 7.3806f)
                curveTo(14.52f, 7.6319f, 15.0712f, 8.0002f, 15.5355f, 8.4645f)
                curveTo(15.9998f, 8.9288f, 16.3681f, 9.48f, 16.6194f, 10.0866f)
                curveTo(16.8707f, 10.6932f, 17.0f, 11.3434f, 17.0f, 12.0f)
                lineTo(17.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.8478f, 13.9134f)
                curveTo(13.9483f, 13.3068f, 14.0f, 12.6566f, 14.0f, 12.0f)
                curveTo(14.0f, 11.3434f, 13.9483f, 10.6932f, 13.8478f, 10.0866f)
                curveTo(13.7472f, 9.48f, 13.5999f, 8.9288f, 13.4142f, 8.4645f)
                curveTo(13.2285f, 8.0002f, 13.008f, 7.6319f, 12.7654f, 7.3806f)
                curveTo(12.5227f, 7.1293f, 12.2626f, 7.0f, 12.0f, 7.0f)
                curveTo(11.7374f, 7.0f, 11.4773f, 7.1293f, 11.2346f, 7.3806f)
                curveTo(10.992f, 7.6319f, 10.7715f, 8.0002f, 10.5858f, 8.4645f)
                curveTo(10.4001f, 8.9288f, 10.2528f, 9.4799f, 10.1522f, 10.0866f)
                curveTo(10.0517f, 10.6932f, 10.0f, 11.3434f, 10.0f, 12.0f)
                curveTo(10.0f, 12.6566f, 10.0517f, 13.3068f, 10.1522f, 13.9134f)
                curveTo(10.2527f, 14.52f, 10.4001f, 15.0712f, 10.5858f, 15.5355f)
                curveTo(10.7715f, 15.9998f, 10.992f, 16.3681f, 11.2346f, 16.6194f)
                curveTo(11.4773f, 16.8707f, 11.7374f, 17.0f, 12.0f, 17.0f)
                curveTo(12.2626f, 17.0f, 12.5227f, 16.8707f, 12.7654f, 16.6194f)
                curveTo(13.008f, 16.3681f, 13.2285f, 15.9998f, 13.4142f, 15.5355f)
                curveTo(13.5999f, 15.0712f, 13.7472f, 14.52f, 13.8478f, 13.9134f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 12.0f)
                horizontalLineTo(17.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
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
                curveTo(21.0f, 14.4963f, 20.1632f, 16.4284f, 19.0f, 17.9041f)
                moveTo(3.1928f, 14.0f)
                curveTo(4.0503f, 18.2984f, 7.5764f, 20.5129f, 9.8986f, 21.5273f)
                curveTo(10.62f, 21.8424f, 10.9807f, 22.0f, 12.0f, 22.0f)
                curveTo(13.0193f, 22.0f, 13.38f, 21.8424f, 14.1014f, 21.5273f)
                curveTo(14.6796f, 21.2747f, 15.3324f, 20.9478f, 16.0f, 20.5328f)
            }
        }
        .build()
        return _shieldNetwork!!
    }

private var _shieldNetwork: ImageVector? = null
