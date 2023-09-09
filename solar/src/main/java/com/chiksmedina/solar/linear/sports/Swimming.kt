package com.chiksmedina.solar.linear.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.SportsGroup

public val SportsGroup.Swimming: ImageVector
    get() {
        if (_swimming != null) {
            return _swimming!!
        }
        _swimming = Builder(name = "Swimming", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 15.7723f)
                curveTo(20.4123f, 15.3982f, 19.5955f, 14.4791f, 18.9199f, 13.4569f)
                curveTo(18.4965f, 12.8163f, 17.5655f, 12.8553f, 17.1055f, 13.4701f)
                curveTo(16.0541f, 14.8757f, 14.4844f, 15.9999f, 12.0f, 15.9999f)
                curveTo(9.4935f, 15.9999f, 7.9181f, 14.5695f, 6.8665f, 13.2234f)
                curveTo(6.4272f, 12.6611f, 5.5862f, 12.6686f, 5.2017f, 13.2697f)
                curveTo(4.5008f, 14.3655f, 3.684f, 15.3755f, 2.0f, 15.7723f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 20.7723f)
                curveTo(20.4123f, 20.3982f, 19.5955f, 19.4791f, 18.9199f, 18.4569f)
                curveTo(18.4965f, 17.8163f, 17.5655f, 17.8553f, 17.1055f, 18.4701f)
                curveTo(16.0541f, 19.8757f, 14.4844f, 20.9999f, 12.0f, 20.9999f)
                curveTo(9.4935f, 20.9999f, 7.9181f, 19.5695f, 6.8665f, 18.2234f)
                curveTo(6.4272f, 17.6611f, 5.5862f, 17.6686f, 5.2017f, 18.2697f)
                curveTo(4.5008f, 19.3655f, 3.684f, 20.3755f, 2.0f, 20.7723f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 11.5f)
                lineTo(7.4769f, 9.4138f)
                curveTo(8.2733f, 8.936f, 8.4485f, 7.8566f, 7.8441f, 7.1514f)
                lineTo(6.8564f, 5.9991f)
                curveTo(6.3731f, 5.4353f, 6.4054f, 4.5946f, 6.9305f, 4.0695f)
                curveTo(7.51f, 3.4899f, 8.4584f, 3.5196f, 9.0007f, 4.1342f)
                lineTo(15.5f, 11.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 8.0f)
                curveTo(18.3807f, 8.0f, 19.5f, 6.8807f, 19.5f, 5.5f)
                curveTo(19.5f, 4.1193f, 18.3807f, 3.0f, 17.0f, 3.0f)
                curveTo(15.6193f, 3.0f, 14.5f, 4.1193f, 14.5f, 5.5f)
                curveTo(14.5f, 6.8807f, 15.6193f, 8.0f, 17.0f, 8.0f)
                close()
            }
        }
        .build()
        return _swimming!!
    }

private var _swimming: ImageVector? = null
