package com.chiksmedina.solar.boldduotone.security

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val SecurityGroup.ShieldCheck: ImageVector
    get() {
        if (_shieldCheck != null) {
            return _shieldCheck!!
        }
        _shieldCheck = Builder(name = "ShieldCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
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
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0595f, 10.4995f)
                curveTo(15.3353f, 10.1905f, 15.3085f, 9.7164f, 14.9995f, 9.4405f)
                curveTo(14.6905f, 9.1647f, 14.2164f, 9.1915f, 13.9406f, 9.5005f)
                lineTo(10.9286f, 12.8739f)
                lineTo(10.0595f, 11.9005f)
                curveTo(9.7836f, 11.5915f, 9.3095f, 11.5647f, 9.0005f, 11.8406f)
                curveTo(8.6915f, 12.1164f, 8.6647f, 12.5905f, 8.9405f, 12.8995f)
                lineTo(10.3691f, 14.4995f)
                curveTo(10.5114f, 14.6589f, 10.7149f, 14.75f, 10.9286f, 14.75f)
                curveTo(11.1422f, 14.75f, 11.3457f, 14.6589f, 11.488f, 14.4995f)
                lineTo(15.0595f, 10.4995f)
                close()
            }
        }
        .build()
        return _shieldCheck!!
    }

private var _shieldCheck: ImageVector? = null
