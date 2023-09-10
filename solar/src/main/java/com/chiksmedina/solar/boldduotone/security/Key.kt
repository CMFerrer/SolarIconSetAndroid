package com.chiksmedina.solar.boldduotone.security

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
import com.chiksmedina.solar.boldduotone.SecurityGroup

val SecurityGroup.Key: ImageVector
    get() {
        if (_key != null) {
            return _key!!
        }
        _key = Builder(
            name = "Key", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
            = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(22.0f, 8.2934f)
                curveTo(22.0f, 11.7692f, 19.1708f, 14.5869f, 15.6807f, 14.5869f)
                curveTo(15.0439f, 14.5869f, 13.5939f, 14.4405f, 12.8885f, 13.8551f)
                lineTo(12.0067f, 14.7333f)
                curveTo(11.4883f, 15.2496f, 11.6283f, 15.4016f, 11.8589f, 15.652f)
                curveTo(11.9551f, 15.7565f, 12.0672f, 15.8781f, 12.1537f, 16.0505f)
                curveTo(12.1537f, 16.0505f, 12.8885f, 17.075f, 12.1537f, 18.0995f)
                curveTo(11.7128f, 18.6849f, 10.4783f, 19.5045f, 9.0675f, 18.0995f)
                lineTo(8.7736f, 18.3922f)
                curveTo(8.7736f, 18.3922f, 9.6554f, 19.4167f, 8.9206f, 20.4412f)
                curveTo(8.4797f, 21.0267f, 7.304f, 21.6121f, 6.2753f, 20.5876f)
                lineTo(5.2466f, 21.6121f)
                curveTo(4.5412f, 22.3146f, 3.679f, 21.9048f, 3.3362f, 21.6121f)
                lineTo(2.4544f, 20.7339f)
                curveTo(1.6314f, 19.9143f, 2.1115f, 19.0264f, 2.4544f, 18.6849f)
                lineTo(10.0963f, 11.0743f)
                curveTo(10.0963f, 11.0743f, 9.3615f, 9.9034f, 9.3615f, 8.2934f)
                curveTo(9.3615f, 4.8177f, 12.1907f, 2.0f, 15.6807f, 2.0f)
                curveTo(19.1708f, 2.0f, 22.0f, 4.8177f, 22.0f, 8.2934f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.8853f, 8.2935f)
                curveTo(17.8853f, 9.506f, 16.8984f, 10.4889f, 15.681f, 10.4889f)
                curveTo(14.4635f, 10.4889f, 13.4766f, 9.506f, 13.4766f, 8.2935f)
                curveTo(13.4766f, 7.081f, 14.4635f, 6.0981f, 15.681f, 6.0981f)
                curveTo(16.8984f, 6.0981f, 17.8853f, 7.081f, 17.8853f, 8.2935f)
                close()
            }
        }
            .build()
        return _key!!
    }

private var _key: ImageVector? = null
