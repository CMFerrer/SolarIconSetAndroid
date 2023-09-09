package com.chiksmedina.solar.boldduotone.essentionalui

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
import com.chiksmedina.solar.boldduotone.EssentionalUiGroup

public val EssentionalUiGroup.MentionCircle: ImageVector
    get() {
        if (_mentionCircle != null) {
            return _mentionCircle!!
        }
        _mentionCircle = Builder(name = "MentionCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 6.75f)
                curveTo(9.1005f, 6.75f, 6.75f, 9.1005f, 6.75f, 12.0f)
                curveTo(6.75f, 14.8995f, 9.1005f, 17.25f, 12.0f, 17.25f)
                curveTo(12.4142f, 17.25f, 12.75f, 17.5858f, 12.75f, 18.0f)
                curveTo(12.75f, 18.4142f, 12.4142f, 18.75f, 12.0f, 18.75f)
                curveTo(8.2721f, 18.75f, 5.25f, 15.7279f, 5.25f, 12.0f)
                curveTo(5.25f, 8.2721f, 8.2721f, 5.25f, 12.0f, 5.25f)
                curveTo(15.7279f, 5.25f, 18.75f, 8.2721f, 18.75f, 12.0f)
                curveTo(18.75f, 12.8103f, 18.6069f, 13.5889f, 18.3439f, 14.3108f)
                curveTo(18.211f, 14.6756f, 17.9855f, 14.9732f, 17.7354f, 15.204f)
                lineTo(17.6548f, 15.2783f)
                curveTo(16.8451f, 16.0252f, 15.6294f, 16.121f, 14.7127f, 15.5099f)
                curveTo(14.3431f, 15.2635f, 14.0557f, 14.9233f, 13.8735f, 14.5325f)
                curveTo(13.3499f, 14.9205f, 12.7017f, 15.15f, 12.0f, 15.15f)
                curveTo(10.2603f, 15.15f, 8.85f, 13.7397f, 8.85f, 12.0f)
                curveTo(8.85f, 10.2603f, 10.2603f, 8.85f, 12.0f, 8.85f)
                curveTo(13.7397f, 8.85f, 15.15f, 10.2603f, 15.15f, 12.0f)
                verticalLineTo(13.5241f)
                curveTo(15.15f, 13.8206f, 15.2981f, 14.0974f, 15.5448f, 14.2618f)
                curveTo(15.8853f, 14.4888f, 16.3369f, 14.4533f, 16.6377f, 14.1758f)
                lineTo(16.7183f, 14.1015f)
                curveTo(16.8295f, 13.9989f, 16.8991f, 13.8944f, 16.9345f, 13.7973f)
                curveTo(17.1384f, 13.2376f, 17.25f, 12.6327f, 17.25f, 12.0f)
                curveTo(17.25f, 9.1005f, 14.8995f, 6.75f, 12.0f, 6.75f)
                close()
                moveTo(12.0f, 10.35f)
                curveTo(12.9113f, 10.35f, 13.65f, 11.0887f, 13.65f, 12.0f)
                curveTo(13.65f, 12.9113f, 12.9113f, 13.65f, 12.0f, 13.65f)
                curveTo(11.0887f, 13.65f, 10.35f, 12.9113f, 10.35f, 12.0f)
                curveTo(10.35f, 11.0887f, 11.0887f, 10.35f, 12.0f, 10.35f)
                close()
            }
        }
        .build()
        return _mentionCircle!!
    }

private var _mentionCircle: ImageVector? = null
