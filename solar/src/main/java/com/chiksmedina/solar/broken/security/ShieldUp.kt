package com.chiksmedina.solar.broken.security

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.SecurityGroup

val SecurityGroup.ShieldUp: ImageVector
    get() {
        if (_shieldUp != null) {
            return _shieldUp!!
        }
        _shieldUp = Builder(
            name = "ShieldUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.0f, 11.5502f)
                lineTo(12.6f, 9.0002f)
                curveTo(12.2444f, 8.7335f, 11.7556f, 8.7335f, 11.4f, 9.0002f)
                lineTo(8.0f, 11.5502f)
                moveTo(14.0f, 14.0502f)
                lineTo(12.0f, 12.5502f)
                lineTo(10.0f, 14.0502f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
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
                curveTo(21.0f, 14.4963f, 20.1632f, 16.4284f, 19.0f, 17.9041f)
                moveTo(3.1928f, 14.0f)
                curveTo(4.0503f, 18.2984f, 7.5764f, 20.5129f, 9.8986f, 21.5273f)
                curveTo(10.62f, 21.8424f, 10.9807f, 22.0f, 12.0f, 22.0f)
                curveTo(13.0193f, 22.0f, 13.38f, 21.8424f, 14.1014f, 21.5273f)
                curveTo(14.6796f, 21.2747f, 15.3324f, 20.9478f, 16.0f, 20.5328f)
            }
        }
            .build()
        return _shieldUp!!
    }

private var _shieldUp: ImageVector? = null
