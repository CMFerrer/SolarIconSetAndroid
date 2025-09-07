package com.chiksmedina.solar.outline.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.MapLocationGroup

val MapLocationGroup.MapArrowSquare: ImageVector
    get() {
        if (_mapArrowSquare != null) {
            return _mapArrowSquare!!
        }
        _mapArrowSquare = Builder(
            name = "MapArrowSquare", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(17.3864f, 2.9264f)
                curveTo(16.0864f, 2.7516f, 14.3782f, 2.75f, 12.0f, 2.75f)
                curveTo(9.6218f, 2.75f, 7.9136f, 2.7516f, 6.6136f, 2.9264f)
                curveTo(5.3352f, 3.0982f, 4.5644f, 3.4251f, 3.9948f, 3.9948f)
                curveTo(3.4251f, 4.5644f, 3.0982f, 5.3352f, 2.9264f, 6.6136f)
                curveTo(2.7516f, 7.9136f, 2.75f, 9.6218f, 2.75f, 12.0f)
                curveTo(2.75f, 14.3782f, 2.7516f, 16.0864f, 2.9264f, 17.3864f)
                curveTo(3.0982f, 18.6648f, 3.4251f, 19.4355f, 3.9948f, 20.0052f)
                curveTo(4.5644f, 20.5749f, 5.3352f, 20.9018f, 6.6136f, 21.0736f)
                curveTo(7.9136f, 21.2484f, 9.6218f, 21.25f, 12.0f, 21.25f)
                curveTo(14.3782f, 21.25f, 16.0864f, 21.2484f, 17.3864f, 21.0736f)
                curveTo(18.6648f, 20.9018f, 19.4355f, 20.5749f, 20.0052f, 20.0052f)
                curveTo(20.5749f, 19.4355f, 20.9018f, 18.6648f, 21.0736f, 17.3864f)
                curveTo(21.2484f, 16.0864f, 21.25f, 14.3782f, 21.25f, 12.0f)
                curveTo(21.25f, 9.6218f, 21.2484f, 7.9136f, 21.0736f, 6.6136f)
                curveTo(20.9018f, 5.3352f, 20.5749f, 4.5644f, 20.0052f, 3.9948f)
                curveTo(19.4355f, 3.4251f, 18.6648f, 3.0982f, 17.3864f, 2.9264f)
                close()
                moveTo(17.5863f, 1.4397f)
                curveTo(19.031f, 1.634f, 20.1711f, 2.0393f, 21.0659f, 2.9341f)
                curveTo(21.9607f, 3.8289f, 22.366f, 4.969f, 22.5603f, 6.4137f)
                curveTo(22.75f, 7.8252f, 22.75f, 9.6342f, 22.75f, 11.9426f)
                verticalLineTo(12.0574f)
                curveTo(22.75f, 14.3658f, 22.75f, 16.1748f, 22.5603f, 17.5863f)
                curveTo(22.366f, 19.031f, 21.9607f, 20.1711f, 21.0659f, 21.0659f)
                curveTo(20.1711f, 21.9607f, 19.031f, 22.366f, 17.5863f, 22.5603f)
                curveTo(16.1748f, 22.75f, 14.3658f, 22.75f, 12.0574f, 22.75f)
                horizontalLineTo(11.9426f)
                curveTo(9.6342f, 22.75f, 7.8252f, 22.75f, 6.4137f, 22.5603f)
                curveTo(4.969f, 22.366f, 3.8289f, 21.9607f, 2.9341f, 21.0659f)
                curveTo(2.0393f, 20.1711f, 1.634f, 19.031f, 1.4397f, 17.5863f)
                curveTo(1.25f, 16.1748f, 1.25f, 14.3658f, 1.25f, 12.0574f)
                verticalLineTo(11.9426f)
                curveTo(1.25f, 9.6342f, 1.25f, 7.8252f, 1.4397f, 6.4137f)
                curveTo(1.634f, 4.969f, 2.0393f, 3.8289f, 2.9341f, 2.9341f)
                curveTo(3.8289f, 2.0393f, 4.969f, 1.634f, 6.4137f, 1.4397f)
                curveTo(7.8252f, 1.25f, 9.6342f, 1.25f, 11.9426f, 1.25f)
                horizontalLineTo(12.0574f)
                curveTo(14.3658f, 1.25f, 16.1748f, 1.25f, 17.5863f, 1.4397f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(15.804f, 7.065f)
                lineTo(15.5357f, 6.3646f)
                curveTo(16.8766f, 5.8508f, 18.149f, 7.1232f, 17.6352f, 8.4641f)
                lineTo(14.1231f, 17.6299f)
                curveTo(13.8465f, 18.3516f, 13.19f, 18.7344f, 12.5484f, 18.7493f)
                curveTo(11.8989f, 18.7644f, 11.2097f, 18.3951f, 10.9741f, 17.6197f)
                lineTo(9.9176f, 14.1427f)
                lineTo(10.5834f, 13.9404f)
                lineTo(9.9176f, 14.1427f)
                curveTo(9.9123f, 14.1253f, 9.9042f, 14.1131f, 9.8954f, 14.1044f)
                curveTo(9.8866f, 14.0956f, 9.8744f, 14.0875f, 9.857f, 14.0822f)
                lineTo(6.3801f, 13.0257f)
                curveTo(5.6047f, 12.7901f, 5.2354f, 12.1009f, 5.2505f, 11.4514f)
                curveTo(5.2653f, 10.8098f, 5.6482f, 10.1533f, 6.3699f, 9.8767f)
                lineTo(15.5357f, 6.3646f)
                lineTo(15.804f, 7.065f)
                close()
                moveTo(16.1707f, 7.7523f)
                curveTo(16.1544f, 7.7488f, 16.1229f, 7.746f, 16.0724f, 7.7653f)
                lineTo(6.9066f, 11.2774f)
                curveTo(6.7979f, 11.3191f, 6.752f, 11.4039f, 6.7501f, 11.4862f)
                curveTo(6.7491f, 11.5272f, 6.7603f, 11.5518f, 6.7667f, 11.5614f)
                curveTo(6.7668f, 11.5615f, 6.7669f, 11.5617f, 6.767f, 11.5618f)
                curveTo(6.7698f, 11.5661f, 6.7783f, 11.579f, 6.8162f, 11.5905f)
                lineTo(10.2931f, 12.647f)
                lineTo(10.0751f, 13.3646f)
                lineTo(10.2931f, 12.647f)
                curveTo(10.803f, 12.8019f, 11.1979f, 13.1968f, 11.3528f, 13.7066f)
                lineTo(12.4093f, 17.1836f)
                curveTo(12.4208f, 17.2215f, 12.4337f, 17.2299f, 12.438f, 17.2328f)
                lineTo(12.4384f, 17.233f)
                curveTo(12.448f, 17.2395f, 12.4726f, 17.2507f, 12.5136f, 17.2497f)
                curveTo(12.5959f, 17.2478f, 12.6807f, 17.2019f, 12.7224f, 17.0932f)
                lineTo(16.2345f, 7.9274f)
                curveTo(16.2538f, 7.8769f, 16.251f, 7.8454f, 16.2475f, 7.8291f)
                curveTo(16.2433f, 7.8101f, 16.234f, 7.7932f, 16.2203f, 7.7795f)
                curveTo(16.2066f, 7.7658f, 16.1896f, 7.7565f, 16.1707f, 7.7523f)
                close()
            }
        }
            .build()
        return _mapArrowSquare!!
    }

private var _mapArrowSquare: ImageVector? = null
