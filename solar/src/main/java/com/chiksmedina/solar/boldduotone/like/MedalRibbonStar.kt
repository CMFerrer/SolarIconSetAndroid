package com.chiksmedina.solar.boldduotone.like

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
import com.chiksmedina.solar.boldduotone.LikeGroup

public val LikeGroup.MedalRibbonStar: ImageVector
    get() {
        if (_medalRibbonStar != null) {
            return _medalRibbonStar!!
        }
        _medalRibbonStar = Builder(name = "MedalRibbonStar", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 16.0f)
                curveTo(15.866f, 16.0f, 19.0f, 12.866f, 19.0f, 9.0f)
                curveTo(19.0f, 5.134f, 15.866f, 2.0f, 12.0f, 2.0f)
                curveTo(8.134f, 2.0f, 5.0f, 5.134f, 5.0f, 9.0f)
                curveTo(5.0f, 12.866f, 8.134f, 16.0f, 12.0f, 16.0f)
                close()
                moveTo(12.0f, 6.0f)
                curveTo(11.7159f, 6.0f, 11.5259f, 6.3408f, 11.1459f, 7.0225f)
                lineTo(11.0476f, 7.1989f)
                curveTo(10.9397f, 7.3926f, 10.8857f, 7.4894f, 10.8015f, 7.5533f)
                curveTo(10.7173f, 7.6172f, 10.6125f, 7.641f, 10.4028f, 7.6884f)
                lineTo(10.2119f, 7.7316f)
                curveTo(9.474f, 7.8986f, 9.105f, 7.982f, 9.0172f, 8.2643f)
                curveTo(8.9295f, 8.5466f, 9.181f, 8.8407f, 9.684f, 9.429f)
                lineTo(9.8142f, 9.5812f)
                curveTo(9.9571f, 9.7483f, 10.0286f, 9.8319f, 10.0608f, 9.9353f)
                curveTo(10.0929f, 10.0387f, 10.0821f, 10.1502f, 10.0605f, 10.3733f)
                lineTo(10.0408f, 10.5763f)
                curveTo(9.9648f, 11.3612f, 9.9267f, 11.7536f, 10.1565f, 11.9281f)
                curveTo(10.3864f, 12.1025f, 10.7318f, 11.9435f, 11.4227f, 11.6254f)
                lineTo(11.6014f, 11.5431f)
                curveTo(11.7978f, 11.4527f, 11.8959f, 11.4075f, 12.0f, 11.4075f)
                curveTo(12.1041f, 11.4075f, 12.2022f, 11.4527f, 12.3986f, 11.5431f)
                lineTo(12.5773f, 11.6254f)
                curveTo(13.2682f, 11.9435f, 13.6136f, 12.1025f, 13.8435f, 11.9281f)
                curveTo(14.0733f, 11.7536f, 14.0352f, 11.3612f, 13.9592f, 10.5763f)
                lineTo(13.9395f, 10.3733f)
                curveTo(13.9179f, 10.1502f, 13.9071f, 10.0387f, 13.9392f, 9.9353f)
                curveTo(13.9714f, 9.8319f, 14.0429f, 9.7483f, 14.1858f, 9.5812f)
                lineTo(14.316f, 9.429f)
                curveTo(14.819f, 8.8407f, 15.0706f, 8.5466f, 14.9828f, 8.2643f)
                curveTo(14.895f, 7.982f, 14.526f, 7.8986f, 13.7881f, 7.7316f)
                lineTo(13.5972f, 7.6884f)
                curveTo(13.3875f, 7.641f, 13.2827f, 7.6172f, 13.1985f, 7.5533f)
                curveTo(13.1143f, 7.4894f, 13.0603f, 7.3926f, 12.9524f, 7.1989f)
                lineTo(12.8541f, 7.0225f)
                curveTo(12.4741f, 6.3408f, 12.2841f, 6.0f, 12.0f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.7142f, 17.323f)
                lineTo(7.3511f, 15.0f)
                lineTo(8.0f, 13.0f)
                horizontalLineTo(16.0f)
                lineTo(16.6489f, 15.0f)
                lineTo(17.2858f, 17.323f)
                curveTo(17.9141f, 19.6148f, 18.2283f, 20.7607f, 17.809f, 21.3881f)
                curveTo(17.6621f, 21.6079f, 17.465f, 21.7844f, 17.2363f, 21.9008f)
                curveTo(16.5837f, 22.2331f, 15.576f, 21.7081f, 13.5607f, 20.658f)
                curveTo(12.8901f, 20.3086f, 12.5548f, 20.1339f, 12.1986f, 20.0959f)
                curveTo(12.0665f, 20.0818f, 11.9335f, 20.0818f, 11.8014f, 20.0959f)
                curveTo(11.4452f, 20.1339f, 11.1099f, 20.3086f, 10.4393f, 20.658f)
                lineTo(10.4393f, 20.658f)
                curveTo(8.424f, 21.7081f, 7.4163f, 22.2331f, 6.7637f, 21.9008f)
                curveTo(6.535f, 21.7844f, 6.3379f, 21.6079f, 6.191f, 21.3881f)
                curveTo(5.7717f, 20.7607f, 6.0859f, 19.6148f, 6.7142f, 17.323f)
                close()
            }
        }
        .build()
        return _medalRibbonStar!!
    }

private var _medalRibbonStar: ImageVector? = null
