package com.chiksmedina.solar.bold.security

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.SecurityGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.3775f, 5.0824f)
                curveTo(3.0f, 5.6203f, 3.0f, 7.2191f, 3.0f, 10.4167f)
                verticalLineTo(11.9914f)
                curveTo(3.0f, 17.6294f, 7.239f, 20.3655f, 9.8986f, 21.5273f)
                curveTo(10.62f, 21.8424f, 10.9807f, 22.0f, 12.0f, 22.0f)
                curveTo(13.0193f, 22.0f, 13.38f, 21.8424f, 14.1014f, 21.5273f)
                curveTo(16.761f, 20.3655f, 21.0f, 17.6294f, 21.0f, 11.9914f)
                verticalLineTo(10.4167f)
                curveTo(21.0f, 7.2191f, 21.0f, 5.6203f, 20.6225f, 5.0824f)
                curveTo(20.245f, 4.5445f, 18.7417f, 4.03f, 15.7351f, 3.0008f)
                lineTo(15.1623f, 2.8047f)
                curveTo(13.595f, 2.2682f, 12.8114f, 2.0f, 12.0f, 2.0f)
                curveTo(11.1886f, 2.0f, 10.405f, 2.2682f, 8.8377f, 2.8047f)
                lineTo(8.2649f, 3.0008f)
                curveTo(5.2583f, 4.03f, 3.755f, 4.5445f, 3.3775f, 5.0824f)
                close()
                moveTo(16.45f, 10.95f)
                lineTo(13.05f, 8.4f)
                curveTo(12.4278f, 7.9333f, 11.5722f, 7.9333f, 10.95f, 8.4f)
                lineTo(7.55f, 10.95f)
                curveTo(7.2186f, 11.1985f, 7.1515f, 11.6686f, 7.4f, 12.0f)
                curveTo(7.6485f, 12.3314f, 8.1186f, 12.3985f, 8.45f, 12.15f)
                lineTo(11.85f, 9.6f)
                curveTo(11.9389f, 9.5333f, 12.0611f, 9.5333f, 12.15f, 9.6f)
                lineTo(15.55f, 12.15f)
                curveTo(15.8814f, 12.3985f, 16.3515f, 12.3314f, 16.6f, 12.0f)
                curveTo(16.8485f, 11.6686f, 16.7814f, 11.1985f, 16.45f, 10.95f)
                close()
                moveTo(14.45f, 13.45f)
                lineTo(12.45f, 11.95f)
                curveTo(12.1833f, 11.75f, 11.8167f, 11.75f, 11.55f, 11.95f)
                lineTo(9.55f, 13.45f)
                curveTo(9.2186f, 13.6985f, 9.1515f, 14.1686f, 9.4f, 14.5f)
                curveTo(9.6485f, 14.8314f, 10.1186f, 14.8985f, 10.45f, 14.65f)
                lineTo(12.0f, 13.4875f)
                lineTo(13.55f, 14.65f)
                curveTo(13.8814f, 14.8985f, 14.3515f, 14.8314f, 14.6f, 14.5f)
                curveTo(14.8485f, 14.1686f, 14.7814f, 13.6985f, 14.45f, 13.45f)
                close()
            }
        }
            .build()
        return _shieldUp!!
    }

private var _shieldUp: ImageVector? = null
