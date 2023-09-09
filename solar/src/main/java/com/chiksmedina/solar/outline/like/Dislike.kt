package com.chiksmedina.solar.outline.like

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.LikeGroup

public val LikeGroup.Dislike: ImageVector
    get() {
        if (_dislike != null) {
            return _dislike!!
        }
        _dislike = Builder(name = "Dislike", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.4382f, 21.2216f)
                curveTo(12.2931f, 21.2682f, 12.1345f, 21.2569f, 11.9998f, 21.192f)
                curveTo(11.8523f, 21.1209f, 11.7548f, 20.9968f, 11.7197f, 20.8618f)
                lineTo(11.244f, 19.0279f)
                curveTo(11.0777f, 18.3866f, 10.8354f, 17.768f, 10.5235f, 17.184f)
                curveTo(10.0392f, 16.2773f, 9.3063f, 15.58f, 8.6265f, 14.9942f)
                lineTo(7.1877f, 13.7544f)
                curveTo(6.9647f, 13.5622f, 6.8474f, 13.2742f, 6.8728f, 12.9802f)
                lineTo(7.685f, 3.5875f)
                curveTo(7.726f, 3.113f, 8.1224f, 2.75f, 8.5963f, 2.75f)
                horizontalLineTo(13.245f)
                curveTo(16.3813f, 2.75f, 19.0238f, 4.9323f, 19.5306f, 7.8629f)
                lineTo(20.2361f, 11.9426f)
                curveTo(20.3332f, 12.5041f, 19.9014f, 13.0158f, 19.3348f, 13.0158f)
                horizontalLineTo(14.1537f)
                curveTo(13.1766f, 13.0158f, 12.4344f, 13.8924f, 12.5921f, 14.8553f)
                lineTo(13.2548f, 18.8998f)
                curveTo(13.3456f, 19.4539f, 13.3197f, 20.0208f, 13.1787f, 20.5642f)
                curveTo(13.1072f, 20.8399f, 12.8896f, 21.0766f, 12.5832f, 21.175f)
                lineTo(12.4382f, 21.2216f)
                lineTo(12.6676f, 21.9356f)
                lineTo(12.4382f, 21.2216f)
                close()
                moveTo(11.3486f, 22.5433f)
                curveTo(11.8312f, 22.7758f, 12.3873f, 22.8135f, 12.897f, 22.6497f)
                lineTo(13.042f, 22.6031f)
                lineTo(12.8126f, 21.8891f)
                lineTo(13.042f, 22.6031f)
                curveTo(13.819f, 22.3535f, 14.4252f, 21.7328f, 14.6307f, 20.9408f)
                curveTo(14.8241f, 20.1952f, 14.8596f, 19.4174f, 14.7351f, 18.6573f)
                lineTo(14.0724f, 14.6128f)
                curveTo(14.0639f, 14.561f, 14.1038f, 14.5158f, 14.1537f, 14.5158f)
                horizontalLineTo(19.3348f)
                curveTo(20.8341f, 14.5158f, 21.9695f, 13.1635f, 21.7142f, 11.687f)
                lineTo(21.0087f, 7.6073f)
                curveTo(20.3708f, 3.919f, 17.0712f, 1.25f, 13.245f, 1.25f)
                horizontalLineTo(8.5963f)
                curveTo(7.3427f, 1.25f, 6.2985f, 2.2097f, 6.1906f, 3.4583f)
                lineTo(5.3784f, 12.851f)
                curveTo(5.3115f, 13.6247f, 5.6202f, 14.3837f, 6.2085f, 14.8907f)
                lineTo(7.6473f, 16.1305f)
                curveTo(8.3025f, 16.6951f, 8.854f, 17.2423f, 9.2004f, 17.8908f)
                curveTo(9.457f, 18.3711f, 9.6557f, 18.8789f, 9.7921f, 19.4046f)
                lineTo(10.2678f, 21.2384f)
                curveTo(10.417f, 21.8137f, 10.8166f, 22.2869f, 11.3486f, 22.5433f)
                close()
                moveTo(2.9677f, 14.5151f)
                curveTo(3.3689f, 14.5324f, 3.7126f, 14.2306f, 3.7472f, 13.8304f)
                lineTo(4.7188f, 2.5939f)
                curveTo(4.7812f, 1.8721f, 4.2127f, 1.25f, 3.4867f, 1.25f)
                curveTo(2.8029f, 1.25f, 2.25f, 1.8047f, 2.25f, 2.4873f)
                verticalLineTo(13.7658f)
                curveTo(2.25f, 14.1674f, 2.5664f, 14.4978f, 2.9677f, 14.5151f)
                close()
            }
        }
        .build()
        return _dislike!!
    }

private var _dislike: ImageVector? = null
