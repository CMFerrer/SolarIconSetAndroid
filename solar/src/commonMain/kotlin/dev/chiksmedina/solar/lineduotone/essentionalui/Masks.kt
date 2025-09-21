package dev.chiksmedina.solar.lineduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.EssentionalUiGroup

val EssentionalUiGroup.Masks: ImageVector
    get() {
        if (_masks != null) {
            return _masks!!
        }
        _masks = Builder(
            name = "Masks", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.7582f, 12.6766f)
                lineTo(15.9131f, 9.3793f)
                curveTo(15.4725f, 7.6604f, 15.2522f, 6.8009f, 14.677f, 6.3689f)
                curveTo(14.4841f, 6.224f, 14.268f, 6.1166f, 14.0388f, 6.0516f)
                curveTo(13.3551f, 5.8578f, 12.5782f, 6.2216f, 11.0242f, 6.9493f)
                curveTo(9.8735f, 7.4882f, 9.2981f, 7.7576f, 8.6977f, 7.9482f)
                curveTo(8.489f, 8.0145f, 8.2782f, 8.0735f, 8.0658f, 8.1252f)
                curveTo(7.4547f, 8.274f, 6.8276f, 8.3414f, 5.5733f, 8.4762f)
                curveTo(3.8795f, 8.6583f, 3.0325f, 8.7493f, 2.5332f, 9.2745f)
                curveTo(2.3658f, 9.4505f, 2.23f, 9.6566f, 2.1323f, 9.8828f)
                curveTo(1.8407f, 10.5577f, 2.061f, 11.4171f, 2.5016f, 13.136f)
                lineTo(3.3467f, 16.4334f)
                curveTo(4.3402f, 20.3093f, 7.6433f, 21.5286f, 9.8629f, 21.9058f)
                curveTo(10.5401f, 22.0208f, 10.8787f, 22.0784f, 11.907f, 21.7903f)
                curveTo(12.9353f, 21.5023f, 13.201f, 21.2755f, 13.7324f, 20.8219f)
                curveTo(15.4742f, 19.335f, 17.7517f, 16.5526f, 16.7582f, 12.6766f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.5f, 17.221f)
                curveTo(18.2412f, 16.4706f, 19.9791f, 15.0638f, 20.6533f, 12.4334f)
                lineTo(21.4984f, 9.136f)
                curveTo(21.939f, 7.4171f, 22.1593f, 6.5577f, 21.8678f, 5.8828f)
                curveTo(21.77f, 5.6566f, 21.6342f, 5.4505f, 21.4668f, 5.2745f)
                curveTo(20.9675f, 4.7493f, 20.1206f, 4.6583f, 18.4267f, 4.4762f)
                curveTo(17.1725f, 4.3414f, 16.5453f, 4.274f, 15.9342f, 4.1252f)
                curveTo(15.7218f, 4.0735f, 15.511f, 4.0145f, 15.3023f, 3.9482f)
                curveTo(14.7019f, 3.7576f, 14.1266f, 3.4882f, 12.9758f, 2.9493f)
                curveTo(11.4219f, 2.2216f, 10.6449f, 1.8578f, 9.9613f, 2.0516f)
                curveTo(9.7321f, 2.1166f, 9.5159f, 2.224f, 9.3231f, 2.3689f)
                curveTo(8.7478f, 2.8009f, 8.5275f, 3.6604f, 8.087f, 5.3793f)
                lineTo(7.3875f, 8.1085f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.2588f, 13.2955f)
                curveTo(5.3189f, 12.6763f, 5.78f, 12.1206f, 6.4489f, 11.9414f)
                curveTo(7.1178f, 11.7621f, 7.7949f, 12.0128f, 8.1566f, 12.5191f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.1797f, 8.9356f)
                curveTo(19.1195f, 8.3164f, 18.6585f, 7.7607f, 17.9896f, 7.5815f)
                curveTo(17.3207f, 7.4023f, 16.6436f, 7.653f, 16.2819f, 8.1592f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.0547f, 11.7423f)
                curveTo(11.1148f, 11.123f, 11.5759f, 10.5674f, 12.2448f, 10.3881f)
                curveTo(12.9137f, 10.2089f, 13.5908f, 10.4596f, 13.9525f, 10.9658f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.0963f, 7.042f)
                curveTo(10.8555f, 7.379f, 10.3871f, 7.457f, 10.05f, 7.2162f)
                curveTo(9.713f, 6.9754f, 9.635f, 6.507f, 9.8758f, 6.17f)
                lineTo(11.0963f, 7.042f)
                close()
                moveTo(11.9996f, 6.7527f)
                curveTo(11.6209f, 6.6512f, 11.2692f, 6.8f, 11.0963f, 7.042f)
                lineTo(9.8758f, 6.17f)
                curveTo(10.4263f, 5.3995f, 11.4287f, 5.0468f, 12.3879f, 5.3038f)
                lineTo(11.9996f, 6.7527f)
                close()
                moveTo(12.4781f, 7.0656f)
                curveTo(12.3675f, 6.9229f, 12.2041f, 6.8075f, 11.9996f, 6.7527f)
                lineTo(12.3879f, 5.3038f)
                curveTo(12.9124f, 5.4444f, 13.3545f, 5.7479f, 13.6635f, 6.1464f)
                lineTo(12.4781f, 7.0656f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.2007f, 16.231f)
                curveTo(13.2007f, 16.231f, 12.1758f, 15.4703f, 10.3884f, 15.9492f)
                curveTo(8.6009f, 16.4282f, 8.0937f, 17.5994f, 8.0937f, 17.5994f)
            }
        }
            .build()
        return _masks!!
    }

private var _masks: ImageVector? = null
