package com.chiksmedina.solar.outline.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.EssentionalUiGroup

public val EssentionalUiGroup.Flag2: ImageVector
    get() {
        if (_flag2 != null) {
            return _flag2!!
        }
        _flag2 = Builder(name = "Flag2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.0f, 1.25f)
                curveTo(5.4142f, 1.25f, 5.75f, 1.5858f, 5.75f, 2.0f)
                verticalLineTo(3.0852f)
                lineTo(7.3236f, 2.7704f)
                curveTo(9.1168f, 2.4118f, 10.9756f, 2.5824f, 12.6735f, 3.2616f)
                lineTo(13.0868f, 3.4269f)
                curveTo(14.3652f, 3.9383f, 15.7724f, 4.0338f, 17.1082f, 3.6999f)
                curveTo(18.3875f, 3.38f, 19.4147f, 4.7665f, 18.7363f, 5.8972f)
                lineTo(17.4578f, 8.0281f)
                curveTo(17.0814f, 8.6554f, 17.021f, 8.7848f, 17.0056f, 8.9028f)
                curveTo(16.9972f, 8.9673f, 16.9972f, 9.0327f, 17.0056f, 9.0972f)
                curveTo(17.021f, 9.2152f, 17.0814f, 9.3446f, 17.4578f, 9.9719f)
                lineTo(19.0184f, 12.573f)
                curveTo(19.5884f, 13.5229f, 19.0787f, 14.7534f, 18.004f, 15.0221f)
                lineTo(17.9039f, 15.0471f)
                curveTo(15.9814f, 15.5277f, 13.9563f, 15.3903f, 12.1164f, 14.6543f)
                curveTo(10.6886f, 14.0832f, 9.1256f, 13.9397f, 7.6178f, 14.2413f)
                lineTo(5.75f, 14.6149f)
                verticalLineTo(22.0f)
                curveTo(5.75f, 22.4142f, 5.4142f, 22.75f, 5.0f, 22.75f)
                curveTo(4.5858f, 22.75f, 4.25f, 22.4142f, 4.25f, 22.0f)
                verticalLineTo(2.0f)
                curveTo(4.25f, 1.5858f, 4.5858f, 1.25f, 5.0f, 1.25f)
                close()
                moveTo(5.75f, 13.0851f)
                lineTo(7.3236f, 12.7704f)
                curveTo(9.1168f, 12.4118f, 10.9756f, 12.5825f, 12.6735f, 13.2616f)
                curveTo(14.2206f, 13.8805f, 15.9235f, 13.996f, 17.5401f, 13.5919f)
                lineTo(17.6402f, 13.5669f)
                curveTo(17.7377f, 13.5425f, 17.7839f, 13.4309f, 17.7322f, 13.3447f)
                lineTo(16.1716f, 10.7437f)
                curveTo(16.1517f, 10.7106f, 16.132f, 10.6779f, 16.1125f, 10.6455f)
                curveTo(15.8295f, 10.1756f, 15.5796f, 9.7605f, 15.5183f, 9.2918f)
                curveTo(15.493f, 9.0981f, 15.493f, 8.9019f, 15.5183f, 8.7082f)
                curveTo(15.5796f, 8.2395f, 15.8295f, 7.8244f, 16.1125f, 7.3545f)
                curveTo(16.132f, 7.3221f, 16.1517f, 7.2894f, 16.1716f, 7.2563f)
                lineTo(17.4254f, 5.1666f)
                curveTo(15.7976f, 5.5632f, 14.0861f, 5.4422f, 12.5297f, 4.8196f)
                lineTo(12.1164f, 4.6543f)
                curveTo(10.6886f, 4.0832f, 9.1256f, 3.9397f, 7.6178f, 4.2413f)
                lineTo(5.75f, 4.6149f)
                verticalLineTo(13.0851f)
                close()
            }
        }
        .build()
        return _flag2!!
    }

private var _flag2: ImageVector? = null
