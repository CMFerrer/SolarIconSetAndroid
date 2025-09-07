package com.chiksmedina.solar.boldduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.EssentionalUiGroup

val EssentionalUiGroup.Cursor: ImageVector
    get() {
        if (_cursor != null) {
            return _cursor!!
        }
        _cursor = Builder(
            name = "Cursor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.4334f, 16.4643f)
                lineTo(12.6361f, 15.2616f)
                lineTo(15.2616f, 12.6361f)
                lineTo(16.4643f, 11.4334f)
                curveTo(17.6955f, 10.2022f, 18.3111f, 9.5866f, 18.1658f, 8.9249f)
                curveTo(18.0204f, 8.2632f, 17.2035f, 7.9623f, 15.5696f, 7.3603f)
                lineTo(10.1205f, 5.3527f)
                curveTo(6.8611f, 4.1519f, 5.2314f, 3.5515f, 4.3914f, 4.3914f)
                curveTo(3.5515f, 5.2314f, 4.1519f, 6.8611f, 5.3527f, 10.1205f)
                lineTo(7.3603f, 15.5696f)
                curveTo(7.9623f, 17.2035f, 8.2632f, 18.0204f, 8.9249f, 18.1658f)
                curveTo(9.5866f, 18.3111f, 10.2022f, 17.6955f, 11.4334f, 16.4643f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.6357f, 15.2618f)
                lineTo(16.574f, 19.2001f)
                curveTo(16.9818f, 19.6079f, 17.1857f, 19.8117f, 17.4132f, 19.906f)
                curveTo(17.7164f, 20.0316f, 18.0572f, 20.0316f, 18.3605f, 19.906f)
                curveTo(18.5879f, 19.8117f, 18.7918f, 19.6078f, 19.1996f, 19.2001f)
                curveTo(19.6074f, 18.7923f, 19.8113f, 18.5884f, 19.9055f, 18.3609f)
                curveTo(20.0311f, 18.0577f, 20.0311f, 17.7169f, 19.9055f, 17.4137f)
                curveTo(19.8113f, 17.1862f, 19.6074f, 16.9823f, 19.1996f, 16.5745f)
                lineTo(15.2613f, 12.6362f)
                lineTo(12.6357f, 15.2618f)
                close()
            }
        }
            .build()
        return _cursor!!
    }

private var _cursor: ImageVector? = null
