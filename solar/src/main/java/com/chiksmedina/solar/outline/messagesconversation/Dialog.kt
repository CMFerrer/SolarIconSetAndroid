package com.chiksmedina.solar.outline.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.outline.MessagesConversationGroup

public val MessagesConversationGroup.Dialog: ImageVector
    get() {
        if (_dialog != null) {
            return _dialog!!
        }
        _dialog = Builder(name = "Dialog", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.989f, 5.3078f)
                curveTo(10.169f, 2.9055f, 12.6404f, 1.25f, 15.5f, 1.25f)
                curveTo(19.5041f, 1.25f, 22.75f, 4.4959f, 22.75f, 8.5f)
                curveTo(22.75f, 9.5721f, 22.5168f, 10.5918f, 22.0977f, 11.5093f)
                curveTo(21.9883f, 11.7488f, 21.967f, 11.975f, 22.0156f, 12.1568f)
                lineTo(22.143f, 12.6328f)
                curveTo(22.5507f, 14.1566f, 21.1566f, 15.5507f, 19.6328f, 15.143f)
                lineTo(19.1568f, 15.0156f)
                curveTo(19.0215f, 14.9794f, 18.8616f, 14.982f, 18.6899f, 15.0307f)
                curveTo(18.1798f, 19.3775f, 14.4838f, 22.75f, 10.0f, 22.75f)
                curveTo(8.65f, 22.75f, 7.3695f, 22.4438f, 6.2259f, 21.8963f)
                curveTo(5.9995f, 21.7879f, 5.7766f, 21.7659f, 5.5932f, 21.815f)
                lineTo(4.3672f, 22.143f)
                curveTo(2.8434f, 22.5507f, 1.4493f, 21.1566f, 1.857f, 19.6328f)
                lineTo(2.185f, 18.4068f)
                curveTo(2.2341f, 18.2234f, 2.2121f, 18.0005f, 2.1037f, 17.7741f)
                curveTo(1.5562f, 16.6305f, 1.25f, 15.35f, 1.25f, 14.0f)
                curveTo(1.25f, 9.5094f, 4.6327f, 5.809f, 8.989f, 5.3078f)
                close()
                moveTo(10.735f, 5.2804f)
                curveTo(15.0598f, 5.6401f, 18.4914f, 9.1451f, 18.736f, 13.5016f)
                curveTo(18.9986f, 13.4766f, 19.2714f, 13.4935f, 19.5445f, 13.5666f)
                lineTo(20.0205f, 13.694f)
                curveTo(20.4293f, 13.8034f, 20.8034f, 13.4293f, 20.694f, 13.0205f)
                lineTo(20.5666f, 12.5445f)
                curveTo(20.4095f, 11.9571f, 20.5119f, 11.3708f, 20.7333f, 10.8861f)
                curveTo(21.0649f, 10.1602f, 21.25f, 9.3527f, 21.25f, 8.5f)
                curveTo(21.25f, 5.3244f, 18.6756f, 2.75f, 15.5f, 2.75f)
                curveTo(13.5181f, 2.75f, 11.7692f, 3.7528f, 10.735f, 5.2804f)
                close()
                moveTo(10.0f, 6.75f)
                curveTo(5.9959f, 6.75f, 2.75f, 9.9959f, 2.75f, 14.0f)
                curveTo(2.75f, 15.121f, 3.0039f, 16.1807f, 3.4567f, 17.1264f)
                curveTo(3.6921f, 17.6181f, 3.7908f, 18.2087f, 3.6341f, 18.7945f)
                lineTo(3.306f, 20.0205f)
                curveTo(3.1966f, 20.4293f, 3.5707f, 20.8034f, 3.9795f, 20.694f)
                lineTo(5.2055f, 20.3659f)
                curveTo(5.7913f, 20.2092f, 6.3819f, 20.3079f, 6.8736f, 20.5433f)
                curveTo(7.8193f, 20.9961f, 8.879f, 21.25f, 10.0f, 21.25f)
                curveTo(14.0041f, 21.25f, 17.25f, 18.0041f, 17.25f, 14.0f)
                curveTo(17.25f, 9.9959f, 14.0041f, 6.75f, 10.0f, 6.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 14.0f)
                curveTo(7.5f, 14.5523f, 7.0523f, 15.0f, 6.5f, 15.0f)
                curveTo(5.9477f, 15.0f, 5.5f, 14.5523f, 5.5f, 14.0f)
                curveTo(5.5f, 13.4477f, 5.9477f, 13.0f, 6.5f, 13.0f)
                curveTo(7.0523f, 13.0f, 7.5f, 13.4477f, 7.5f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 14.0f)
                curveTo(11.0f, 14.5523f, 10.5523f, 15.0f, 10.0f, 15.0f)
                curveTo(9.4477f, 15.0f, 9.0f, 14.5523f, 9.0f, 14.0f)
                curveTo(9.0f, 13.4477f, 9.4477f, 13.0f, 10.0f, 13.0f)
                curveTo(10.5523f, 13.0f, 11.0f, 13.4477f, 11.0f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 14.0f)
                curveTo(14.5f, 14.5523f, 14.0523f, 15.0f, 13.5f, 15.0f)
                curveTo(12.9477f, 15.0f, 12.5f, 14.5523f, 12.5f, 14.0f)
                curveTo(12.5f, 13.4477f, 12.9477f, 13.0f, 13.5f, 13.0f)
                curveTo(14.0523f, 13.0f, 14.5f, 13.4477f, 14.5f, 14.0f)
                close()
            }
        }
        .build()
        return _dialog!!
    }

private var _dialog: ImageVector? = null
