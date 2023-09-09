package com.chiksmedina.solar.boldduotone.security

import androidx.compose.ui.graphics.Color
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
import com.chiksmedina.solar.boldduotone.SecurityGroup

public val SecurityGroup.ShieldUp: ImageVector
    get() {
        if (_shieldUp != null) {
            return _shieldUp!!
        }
        _shieldUp = Builder(name = "ShieldUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
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
                curveTo(21.0f, 17.6294f, 16.761f, 20.3655f, 14.1014f, 21.5273f)
                curveTo(13.38f, 21.8424f, 13.0193f, 22.0f, 12.0f, 22.0f)
                curveTo(10.9807f, 22.0f, 10.62f, 21.8424f, 9.8986f, 21.5273f)
                curveTo(7.239f, 20.3655f, 3.0f, 17.6294f, 3.0f, 11.9914f)
                curveTo(3.0f, 11.4234f, 3.0f, 10.8996f, 3.0f, 10.4167f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.95f, 8.4002f)
                curveTo(11.5723f, 7.9335f, 12.4278f, 7.9335f, 13.05f, 8.4002f)
                lineTo(16.45f, 10.9502f)
                curveTo(16.7814f, 11.1987f, 16.8486f, 11.6688f, 16.6f, 12.0002f)
                curveTo(16.3515f, 12.3316f, 15.8814f, 12.3987f, 15.55f, 12.1502f)
                lineTo(12.15f, 9.6002f)
                curveTo(12.0612f, 9.5335f, 11.9389f, 9.5335f, 11.85f, 9.6002f)
                lineTo(8.45f, 12.1502f)
                curveTo(8.1187f, 12.3987f, 7.6486f, 12.3316f, 7.4f, 12.0002f)
                curveTo(7.1515f, 11.6688f, 7.2187f, 11.1987f, 7.55f, 10.9502f)
                lineTo(10.95f, 8.4002f)
                close()
                moveTo(11.55f, 11.9502f)
                curveTo(11.8167f, 11.7502f, 12.1834f, 11.7502f, 12.45f, 11.9502f)
                lineTo(14.45f, 13.4502f)
                curveTo(14.7814f, 13.6987f, 14.8486f, 14.1688f, 14.6f, 14.5002f)
                curveTo(14.3515f, 14.8316f, 13.8814f, 14.8987f, 13.55f, 14.6502f)
                lineTo(12.0f, 13.4877f)
                lineTo(10.45f, 14.6502f)
                curveTo(10.1187f, 14.8987f, 9.6486f, 14.8316f, 9.4f, 14.5002f)
                curveTo(9.1515f, 14.1688f, 9.2187f, 13.6987f, 9.55f, 13.4502f)
                lineTo(11.55f, 11.9502f)
                close()
            }
        }
        .build()
        return _shieldUp!!
    }

private var _shieldUp: ImageVector? = null
