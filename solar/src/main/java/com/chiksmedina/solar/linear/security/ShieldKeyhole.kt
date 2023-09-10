package com.chiksmedina.solar.linear.security

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.SecurityGroup

val SecurityGroup.ShieldKeyhole: ImageVector
    get() {
        if (_shieldKeyhole != null) {
            return _shieldKeyhole!!
        }
        _shieldKeyhole = Builder(
            name = "ShieldKeyhole", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
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
                curveTo(21.0f, 17.6294f, 16.761f, 20.3655f, 14.1014f, 21.5273f)
                curveTo(13.38f, 21.8424f, 13.0193f, 22.0f, 12.0f, 22.0f)
                curveTo(10.9807f, 22.0f, 10.62f, 21.8424f, 9.8986f, 21.5273f)
                curveTo(7.239f, 20.3655f, 3.0f, 17.6294f, 3.0f, 11.9914f)
                curveTo(3.0f, 11.4234f, 3.0f, 10.8996f, 3.0f, 10.4167f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Round,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.5f, 16.0f)
                horizontalLineTo(12.5f)
                curveTo(13.0523f, 16.0f, 13.5f, 15.5523f, 13.5f, 15.0f)
                verticalLineTo(13.5987f)
                curveTo(14.3967f, 13.0799f, 15.0f, 12.1104f, 15.0f, 11.0f)
                curveTo(15.0f, 9.3432f, 13.6569f, 8.0f, 12.0f, 8.0f)
                curveTo(10.3431f, 8.0f, 9.0f, 9.3432f, 9.0f, 11.0f)
                curveTo(9.0f, 12.1104f, 9.6033f, 13.0799f, 10.5f, 13.5987f)
                verticalLineTo(15.0f)
                curveTo(10.5f, 15.5523f, 10.9477f, 16.0f, 11.5f, 16.0f)
                close()
            }
        }
            .build()
        return _shieldKeyhole!!
    }

private var _shieldKeyhole: ImageVector? = null
